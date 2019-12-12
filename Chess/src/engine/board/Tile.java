package engine.Board;


import com.google.common.collect.ImmutableMap;
import engine.Pieces.Piece;
import engine.board.BoardUtils;
import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author yolos
 */

//Defines a class that represents a tile in the chess board
//The abstract class is used so the Tile template can later be used in other subclasses
//for example the whole chess board
public abstract class Tile {

    private static Map<Integer, EmptyTile> createAllPossibleEmptyTiles() {
        
        final Map<Integer, EmptyTile> emptyTileMap = new HashMap<>();
        
        for(int i = 0; i < BoardUtils.NUM_TILES; i++){
            emptyTileMap.put(i, new EmptyTile(i));
        }
        
        //This makes it so the map can't be modified
        return ImmutableMap.copyOf(emptyTileMap);
    }
    
    //protected means it can only be accessed by it's subclasses and
    //final is meant for setting it only once
    protected final int tileCoordinate;
    
    private static final Map<Integer, EmptyTile> EMPTY_TILES_CACHE = createAllPossibleEmptyTiles();
    
    //Tile Creation
    public static Tile createTile(final int tileCoordinate, final Piece piece) {
        return piece != null ? new OccupiedTile(tileCoordinate, piece) : EMPTY_TILES_CACHE.get(tileCoordinate);
    }
    
    //Takes a tile coordinate
    private Tile(final int tileCoordinate) {
        this.tileCoordinate = tileCoordinate;
    }
    
    //Checks if tile is occupied
    public abstract boolean isTileOccupied();
    
    //Retrieves the piece that is on the tile
    public abstract Piece getPiece();
    
    
    //Defines the Empty tile
    public static final class EmptyTile extends Tile{
        
        //super involkes constructors of it's parent class
        private EmptyTile(final int coordinate) {
            super(coordinate);
        }
        
        @Override
        public String toString() {
            return "-";
        }
        
        @Override
        public boolean isTileOccupied() {
            return false;
        }
        
        @Override
        public Piece getPiece() {
            return null;
        }
    }
    
    //Defines the Occupied Tile
    public static final class OccupiedTile extends Tile {
        
        private final Piece pieceOnTile;
        private OccupiedTile(int tileCoordinate,final Piece pieceOnTile) {
            super(tileCoordinate);
            this.pieceOnTile = pieceOnTile;
        }
        
        @Override
        public String toString() {
            return getPiece().getPieceAlliance().isBlack() ? getPiece().toString().toLowerCase() : getPiece().toString();
        }
        
        @Override
        public boolean isTileOccupied() {
            return true;
        }
        
        @Override
        public Piece getPiece() {
            return this.pieceOnTile;
        }
    }
}
