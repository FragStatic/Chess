/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class Rook extends Piece{
    
    
    private final static int[] CANDIDATE_MOVE_VECTOR_COORDINATES = { -8, -1, 1 ,8 };

    
    
    
    public Rook(final Alliance pieceAlliance, final int piecePosition) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(final Board board) {
      final List<Move> legalMoves = new ArrayList<>();
      for(final int candidateCoordinateOffset : CANDIDATE_MOVE_VECTOR_COORDINATES) {
        int candidateDestinationCoordinate = this.piecePosition;
        while(BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)){
            candidateDestinationCoordinate += candidateCoordinateOffset;
            
            if(isFirstCollumnExculsive(candidateDestinationCoordinate, candidateCoordinateOffset) ||
                isEighthCollumnExculsive(candidateDestinationCoordinate, candidateCoordinateOffset)) {
                    break;
            }   
            
            
            if(BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)){

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
                    break;
                }
            }
        }
    }
        return ImmutableList.copyOf(legalMoves);
    }
    @Override
    public String toString() {
        return PieceType.ROOK.toString();
    }
    private static boolean isFirstCollumnExculsive(final int currentPosition, final int candidateOffset) {
        return BoardUtils.FIRST_COLUMN[currentPosition] && (candidateOffset == -1);
    }
    
    private static boolean isEighthCollumnExculsive(final int currentPosition, final int candidateOffset) {
        return BoardUtils.EIGHTH_COLUMN[currentPosition] && (candidateOffset == 1);
    }
    
}
