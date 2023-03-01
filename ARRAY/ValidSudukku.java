import java.util.*;
public class Solution {
   static boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++){
            Set<Character> rows = new HashSet<Character>();
            Set<Character> columns = new HashSet<Character>();
            Set<Character> cube = new HashSet<Character>();
            for(int j = 0; j < 9; j++){
                // Check row
                if(board[i][j] != '.' && !rows.add(board[i][j])){
                    return false;
                }
                
                // Check column
                if(board[j][i] != '.' && !columns.add(board[j][i])){
                    return false;
                }
                
                // Check cube
                int rowIndex = 3 * (i / 3);     // row index of current cube
                int colIndex = 3 * (i % 3);     // col index of current cube
                if(board[rowIndex + j / 3][colIndex + j % 3] != '.' &&
                   !cube.add(board[rowIndex + j / 3][colIndex + j % 3])){
                       return false;
                }
            }
        }
        return true;
    }

   public static void main(String[] args) {
      char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };
      for(int i=0;i<board.length;i++) {
    	  for(int j=0;j<board.length;j++) {
    		  System.out.print( board[i][j]  +"  ");
    	  }
    	  System.out.println();
      }

      System.out.println(isValidSudoku(board));
   }
}
