/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess;

import engine.board.Board;

/**
 *
 * @author yolos
 */
public class Chess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Board board = Board.createStandardBoard();
        
        System.out.println(board);
        
    }
    
}
