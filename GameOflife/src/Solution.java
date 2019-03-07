class Solution {


    public void gameOfLife(int[][] board) {
        if (board == null || board.length == 0) return;
        int rowLength = board.length;
        int colLength  = board[0].length;
        sol(board);

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++) {
                System.out.print(board[i][j]+" ");
                }
            System.out.println();
            }
    }

    boolean checkneighbors(int [][] board, int row, int col){
        int rowLength = board.length;
        int colLength  = board[0].length;
        return row > -1 && col > -1 && row < rowLength && col < colLength && board[row][col]%10==1 ;
    }


    int dfs(int[][] board,int row, int col){
        int[] rn = {-1,-1,-1,0,0,1,1,1};
        int[] cn = {-1,0,1,-1,1,-1,0,1};

        int neighbours=0;
        for(int i=0;i<rn.length;i++)
            if(checkneighbors(board,row+rn[i],col+cn[i])) {
                neighbours++;
            }
        if(board[row][col]==1){
            if(neighbours<2 || neighbours>3)
                return 0;
            else
                return 10;

        }
        else if(neighbours==3 && board[row][col]==0)
            return 10;

        return 0;


    }


    void sol(int[][] board){
        int rowLength = board.length;
        int colLength  = board[0].length;

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){

                board[i][j]+= dfs(board, i,j);

            }

        }

        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){

                board[i][j] = board[i][j]>=10?1:0;

            }

        }


    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[][] nums={{0,1,0},{0,0,1},{1,1,1},{0,0,0}};
        s.gameOfLife(nums);

    }


}