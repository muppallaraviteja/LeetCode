class Solution {


    public int islandPerimeter(int[][] grid) {
        int islands=0, neighbours=0;
        int row=grid.length;
        int col=grid[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(grid[i][j]==1){
                    islands++;
                    if(i<row-1 && grid[i+1][j]==1) neighbours++;
                    if(j<col-1 && grid[i][j+1]==1) neighbours++;

                }
                else
                    break;


            }
        }
        return 4*islands-2*neighbours;
    }

    public static void main(String[] args){
        Solution s= new Solution();
        int[][] grid = {{0,1,0,0},
                        {1,1,1,0},
                        {0,1,0,0},
                        {1,1,0,0}};
        System.out.println(s.islandPerimeter(grid));
    }
}


/*{

                    if((i==0 && j==0))    {
                        if(grid[i][j+1]==1)
                            check--;
                        if(grid[i+1][j]==1)
                            check--;
                    }
                    else if(i==row-1 && j==col-1)    {
                        if(grid[i][j-1]==1)
                            check--;
                        if(grid[i-1][j]==1)
                            check--;
                    }
                    else if(i==row-1 && j==0){
                        if(grid[i][j+1]==1)
                            check--;
                        if(grid[i-1][j]==1)
                            check--;
                    }
                    else if(i==0 && j==col-1){
                        if(grid[i][j-1]==1)
                            check--;
                        if(grid[i+1][j]==1)
                            check--;
                    }
                    else if(i==0){
                        if(grid[i][j-1]==1)
                            check--;
                        if(grid[i][j+1]==1)
                            check--;
                        if(grid[i+1][j]==1)
                            check--;

                    }
                    else if(j==0){
                        if(grid[i-1][j]==1)
                            check--;
                        if(grid[i+1][j]==1)
                            check--;
                        if(grid[i][j+1]==1)
                            check--;
                    }
                    else if(i==row-1){
                        if(grid[i][j-1]==1)
                            check--;
                        if(grid[i][j+1]==1)
                            check--;
                        if(grid[i-1][j]==1)
                            check--;

                    }
                    else if(j==col-1){
                        if(grid[i-1][j]==1)
                            check--;
                        if(grid[i+1][j]==1)
                            check--;
                        if(grid[i][j-1]==1)
                            check--;
                    }
                    else{
                        if(grid[i+1][j]==1)
                            check--;
                        if(grid[i-1][j]==1)
                            check--;
                        if(grid[i][j-1]==1)
                            check--;
                        if(grid[i][j+1]==1)
                            check--;
                    }

                }*/