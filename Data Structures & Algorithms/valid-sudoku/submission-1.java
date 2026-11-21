class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        // first check row wise
        int row = board.length;
        int col = board[0].length;
        for(int i = 0;i<row;i++){
            int[] count = new int[10];
            for(int j = 0;j<col;j++){
                int num = board[i][j] - '0';
               
                if(num > 0){
                    count[num] = count[num] + 1;
                     if(count[num] > 1) return false;
                }
            }
        }

// checking for column wise 
         for(int i = 0;i<row;i++){
            int[] count = new int[10];
            for(int j = 0;j<col;j++){
                int num = board[j][i] - '0';
                if(num > 0){
                    count[num] = count[num] + 1;
                     if(count[num] > 1) return false;
                }
                
            }
        }


        // now check for 3*3 grid
       

       for(int i = 0;i<9;i+=3){
       for(int j = 0;j<9;j+=3)  {
            int[] count = new int[10];
                for(int k = i;k<3+i;k++){
                for(int m = j;m<3+j;m++){
                    
                int num = board[k][m] - '0';
                if(num > 0){
                     count[num] = count[num] + 1;
                     if(count[num] > 1) return false;
                }
                }
            }
        }
        }
             
        return true;
    }
}
