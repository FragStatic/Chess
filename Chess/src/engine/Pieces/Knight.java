
package engine.Pieces;

import chess.Alliance;
import com.google.common.collect.ImmutableList;
import engine.Board.Tile;
import engine.board.Board;
import engine.board.BoardUtils;
import engine.board.Move;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author yolos
 */
public class Knight extends Piece{
    
    //Candidate tiles that the knight can 
    private final static int[] CANDIDATE_MOVE_COORDINATES = { -17, -15, -10, -6, 6, 10, 15, 17};
    
    public Knight(final Alliance pieceAlliance, final int piecePosition) {
        super(piecePosition, pieceAlliance);
    }
    
    @Override
    public Collection<Move> calculateLegalMoves(final Board board){
        
        int candidateDestinationCoordinate;
        final List<Move> legalMoves = new ArrayList<>();
        
        //Checks if the knight can be moved to the candidate legal move
        //For example it would fail if the move is out of the board area or there is already a chess piece there
        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES) {
            
            //Checks the available destination coordinate
            candidateDestinationCoordinate = this.piecePosition + currentCandidateOffset;
            
            //Checks if the tile is valid
            if(BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {
                if(isFirstColumnExclusive(this.piecePosition, currentCandidateOffset) || isSecondColumnExclusive(this.piecePosition, currentCandidateOffset) ||
                        isSeventhColumnExclusive(this.piecePosition, currentCandidateOffset) || isEighthColumnExclusive(this.piecePosition, currentCandidateOffset)){
                    continue;
                    }
                final Tile candidateDestinationTile = board.getTile(candidateDestinationCoordinate);
                
                //Checks if the tile is occupied
                if(!candidateDestinationTile.isTileOccupied()) {
                    legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                }
                else
                {
                    //Recieves what kind of piece is on the occupied tile
                    final Piece pieceAtDestination = candidateDestinationTile.getPiece();
                    //Recieves the Alliance of the piece on the occupied tile
                    final Alliance pieceAlliance = pieceAtDestination.getPieceAlliance();
                    
                    //Checks if the piece on the occupied tile is a friendly or enemy
                    if(this.pieceAlliance != pieceAlliance) {
                        legalMoves.add(new Move.AttackMove(board, this, candidateDestinationCoordinate, pieceAtDestination));
                    }
                }
                
            }
            
        }
       
        return ImmutableList.copyOf(legalMoves);
    }
    @Override
    public String toString() {
        return PieceType.KNIGHT.toString();
    }
    //Checks if the knight is on the first, second, seventh or eighth column to set the legal moves for a night in that position
    private static boolean isFirstColumnExclusive(final int currentPosition, final int candidateOffset) {
       return BoardUtils.FIRST_COLUMN[currentPosition] && (candidateOffset == -17 || candidateOffset == -10 || candidateOffset == 6 || candidateOffset == 15);
    }
    private static boolean isSecondColumnExclusive(final int currentPosition, final int candidateOffset) {
        return BoardUtils.SECOND_COLUMN[currentPosition] && (candidateOffset == -10 || candidateOffset == 6);
    }
    private static boolean isSeventhColumnExclusive(final int currentPosition, final int candidateOffset) {
        return BoardUtils.SEVENTH_COLUMN[currentPosition] && (candidateOffset == -6 || candidateOffset == 10);
    }
    private static boolean isEighthColumnExclusive(final int currentPosition, final int candidateOffset) {
        return BoardUtils.EIGHTH_COLUMN[currentPosition] && (candidateOffset == 17 || candidateOffset == 10 || candidateOffset == -6 || candidateOffset == -15);
    }
}
