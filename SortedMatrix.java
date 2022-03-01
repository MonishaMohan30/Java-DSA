import java.util.*; 
public class SortedMatrix{
    public static void main(String[] args){
        int[][] matrix = {
            {11,13,19},
            {21,23,32},
            {42,52,65},
        };
        System.out.println(Arrays.toString(search(matrix, 32)));
    }

    public static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target){
       while(cStart <= cEnd){
           int mid = cStart + (cEnd - cStart)/2;
           if(matrix[row][mid] == target){
               return new int[]{row, mid};
           }
           if(matrix[row][mid] < target){
               cStart = mid + 1;
           }else{
               cEnd = mid - 1;
           }
       }
       return new int[]{-1,-1};
    }

    public static int[] search(int[][] matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // be cautious the matrix may be empty
        
        if(rows == 1){
           binarySearch(matrix, 0, 0, cols - 1, target);
        }

        int rStart = 0;
        int rEnd = rows;
        int cMid = cols/2;

        //run the loop till 2 rows are remaining
        while (rStart <= rEnd - 1){
            int mid = rEnd + (rEnd - rStart)/2;

            if(matrix[mid][cMid] == target){
                return new int[]{mid,cMid};
            }
            if (matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rEnd = mid;
            }
        }


        if(matrix[rStart][cMid] == target){
            return new int[]{rStart,cMid};
        }
        
        if(matrix[rStart + 1][cMid] == target){
            return new int[]{rStart + 1,cMid};
        }

        // search in 1st half
        if(target <= matrix[rStart][cMid-1]){
          return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        
        // search in 2nd half
        if(target >= matrix[rStart][cMid+1]){
           return binarySearch(matrix, rStart, 0, cMid + 1, target);
        }

         // search in 3rd half
         if(target <= matrix[rStart][cMid+1]){
           return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }

        // search in 4th half
        if(target <= matrix[rStart + 1][cMid-1]){
            return binarySearch(matrix, rStart + 1 , 0, cMid - 1, target);
        }else{
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }
}