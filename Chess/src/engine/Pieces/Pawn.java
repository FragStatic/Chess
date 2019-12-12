/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.Pieces;

import chess.Alliance;
import com.google.common.collect.ImmutableList;
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
public class Pawn extends Piece{

    private final static int[] CANDIDATE_MOVE_COORDINATES = { 8, 16 , 7, 9 };
    
    
    public Pawn(final Alliance pieceAlliance, final int piecePosition) {
        super(piecePosition, pieceAlliance);
    }

    @Override
    public Collection<Move> calculateLegalMoves(Board board) {
        final List<Move> legalMoves = new ArrayList<>();
        
        for(final int currentCandidateOffset : CANDIDATE_MOVE_COORDINATES) {
            
            final int candidateDestinationCoordinate = this.piecePosition + (this.getPieceAlliance().getDirection() * currentCandidateOffset);
            
            if(!BoardUtils.isValidTileCoordinate(candidateDestinationCoordinate)) {
                continue;
            }
            
            if(currentCandidateOffset == 8 && !board.getTile(candidateDestinationCoordinate).isTileOccupied()) {
                legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
            }
            else if(currentCandidateOffset == 16 && this.isFirstMove() &&
                    (BoardUtils.SECOND_ROW[this.piecePosition] && this.getPieceAlliance().isBlack()) ||
                    (BoardUtils.SEVENTH_ROW[this.piecePosition] && this.getPieceAlliance().isWhite())) {
                
                final int behindCandidateDestinationCoordinate = this.piecePosition + (this.getPieceAlliance().getDirection() * 8);
                if(!board.getTile(behindCandidateDestinationCoordinate).isTileOccupied() && 
                   !board.getTile(candidateDestinationCoordinate).isTileOccupied()) {
                    legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                }
            }
            else if(currentCandidateOffset == 7 &&
                   !((BoardUtils.EIGHTH_COLUMN[this.piecePosition] && this.getPieceAlliance().isWhite() || 
                    (BoardUtils.FIRST_COLUMN[this.piecePosition] && this.getPieceAlliance().isBlack())))) {
                
                if(board.getTile(candidateDestinationCoordinate).isTileOccupied()) {
                    final Piece pieceOnCandidate = board.getTile(candidateDestinationCoordinate).getPiece();
                    if(this.pieceAlliance != pieceOnCandidate.getPieceAlliance())
                        
                        legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                }
                
            }
            else if(currentCandidateOffset == 9 &&
                   !((BoardUtils.FIRST_COLUMN[this.piecePosition] && this.getPieceAlliance().isWhite() || 
                    (BoardUtils.EIGHTH_COLUMN[this.piecePosition] && this.getPieceAlliance().isBlack())))) {
                if(board.getTile(candidateDestinationCoordinate).isTileOccupied()) {
                       final Piece pieceOnCandidate = board.getTile(candidateDestinationCoordinate).getPiece();
                       if(this.pieceAlliance != pieceOnCandidate.getPieceAlliance())

                           legalMoves.add(new Move.MajorMove(board, this, candidateDestinationCoordinate));
                   }
            
            }
        }
        
        return ImmutableList.copyOf(legalMoves);
    }
    @Override
    public String toString() {
        return PieceType.PAWN.toString();
    }
    
}
