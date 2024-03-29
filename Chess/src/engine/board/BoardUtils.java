/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package engine.board;



/**
 *
 * @author yolos
 */
public class BoardUtils {
    
    public static final int NUM_TILES = 64;
    public static final int NUM_TILES_PER_ROW = 8;
    
    public static final boolean[] FIRST_COLUMN = initColumn(0);
    public static final boolean[] SECOND_COLUMN = initColumn(1);
    public static final boolean[] SEVENTH_COLUMN = initColumn(8);
    public static final boolean[] EIGHTH_COLUMN = initColumn(7);
    
    public static final boolean[] SECOND_ROW = initRow(8);
    public static final boolean[] SEVENTH_ROW = initRow(48);
    
    
    
    
    
    
    
    private BoardUtils(){
        throw new RuntimeException("You cannot instantiate me!");
    }
    
    //Turns on all the boolean indexes of the selected collumn
    private static boolean[] initColumn(int columnNumber) {
        
        final boolean[] column = new boolean[64];
        
        do{
            column[columnNumber] = true;
            columnNumber += 8;
        } while(columnNumber < 64);
                
        return column;      
    }
    private static boolean[] initRow(int rowNumber){
        final boolean[] row = new boolean[NUM_TILES];
        
        do{
            row[rowNumber] = true;
            rowNumber++;
            
        }while(rowNumber % NUM_TILES_PER_ROW != 0);
        
        return row;
    }
    
    public static boolean isValidTileCoordinate(final int coordinate) {
        return coordinate >=0 && coordinate < NUM_TILES;
    }
    
}
    
