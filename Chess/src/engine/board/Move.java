/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;

import engine.Pieces.Piece;

/**
 *
 * @author yolos
 */
public abstract class Move {
    
    final Board board;
    final Piece movedPiece;
    final int destinationCoordinate;
    
    Move(final Board board, final Piece movedPiece, final int destinationCoordinate) {
        this.board = board;
        this.movedPiece = movedPiece;
        this.destinationCoordinate = destinationCoordinate;
    }
    
    //Regular move
    public static final class MajorMove extends Move {
        
        
        public MajorMove(final Board board, final Piece movedPiece, final int destinationCoordinate) {
            super(board, movedPiece, destinationCoordinate);
        }
    }
    
    //Move while taking enemy piece
    public static final class AttackMove extends Move {
        
        final Piece attackedPiece;
        
        public AttackMove( final Board board, final Piece movedPiece, final int destinationCoordinate, final Piece attackedPiece) {
            super(board, movedPiece, destinationCoordinate);
            this.attackedPiece = attackedPiece;
        }
        
    }
}
