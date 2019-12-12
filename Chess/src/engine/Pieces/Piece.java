package engine.Pieces;

import chess.Alliance;
import engine.board.Board;
import engine.board.Move;
import java.util.Collection;


/**
 *
 * @author yolos
 */
public abstract class Piece {
    
    protected final int piecePosition;
    protected final Alliance pieceAlliance;
    protected final boolean isFirstMove;
    
    //Receives piece position
    //Receives the alliance of the piece(black or white)
    Piece(final int piecePosition, final Alliance pieceAlliance) {
         this.pieceAlliance = pieceAlliance;
         this.piecePosition = piecePosition;
         this.isFirstMove = false;
    }
    
    public int getPiecePosition() {
        return this.piecePosition;
    }
    
    //Returns the the pieces alliance
    public Alliance getPieceAlliance() {
        return this.pieceAlliance;
    }
    
    public boolean isFirstMove() {
        return this.isFirstMove;
    }
    
    //Calculates the legal moves for a piece
    //Each piece will override this because each piece has it's own set of moves
    public abstract Collection<Move> calculateLegalMoves(final Board board);
    
    public enum PieceType {
        
        PAWN("P"),
        KNIGHT("Kn"),
        BISHOP("B"),
        KING("K"),
        QUEEN("Q"),
        ROOK("R");
        
        private String pieceName;
        
        PieceType(final String pieceName) {
            this.pieceName = pieceName;
        }
        
        @Override
        public String toString() {
            return this.pieceName;
        }
    }
}
