import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        if(matrix.length==0)
            return null;

        List<Integer> li =new ArrayList<>();
        int xLength = matrix.length, yLength = matrix[0].length;
        int x=0,y=0;
        for(int i=0;i<xLength/2;i++){
            //Top Row
            for(int j=0;j<yLength;j++){
                li.add(matrix[x][j]);
            }
            //Last Column
            for(int j=0;j<yLength;j++){
                li.add(matrix[xLength-1][yL]);
            }
            //Bottom Row
            for(int j=0;j<yLength;j++){
                li.add(matrix[xLength-1-i][yLength]);
            }
            //First Column
            for(int j=0;j<yLength;j++){
                li.add(matrix[0][j]);
            }
        }
        return li;
    }

    public static void main(String[] args) {

    }
}