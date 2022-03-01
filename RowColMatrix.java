import java.util.*; 
public class RowColMatrix{
    public static void main(String args[]){
     int[][] matrix = {
         {11,13,19},
         {21,23,32},
         {42,52,65},
     };
     System.out.println(Arrays.toString(search(matrix, 32)));
    }

    public static int[] search(int[][] matrix, int target){
        int r = 0;
        int c = matrix.length - 1;
        
        while(r < matrix.length && c >= 0){
            if(matrix[r][c] == target){
                return new int[]{r,c};
            }else if(matrix[r][c] < target){
                r++;
            }else{
                c--;
            }
        }
        return new int[]{-1,-1};
    }
    
}