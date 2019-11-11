import java.util.*;
public class Valid_Sudoku_36 {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character> set = new HashSet<>();
        //row check
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(set.contains(board[r][c])){
                    return false;
                }
                if(board[r][c] != '.'){
                    set.add(board[r][c]);
                }
            }
            set.clear();
        }
        //column check
        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                if(set.contains(board[c][r])){
                    return false;
                }
                if(board[c][r] != '.'){
                    set.add(board[c][r]);
                }
            }
            set.clear();
        }
        //3x3 check
        for(int m = 0; m < 3; m++){
            for(int n = 0; n < 3; n++){

                for(int i = m*3; i < m*3+3; i++){
                    for(int j = n*3; j < n*3+3; j++){
                        if(set.contains(board[i][j])){
                            return false;
                        }
                        if(board[i][j] != '.'){
                            set.add(board[i][j]);
                        }
                    }
                }
                set.clear();

            }
        }

        return true;

    }
}
