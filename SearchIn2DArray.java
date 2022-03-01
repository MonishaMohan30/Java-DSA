import java.util.Arrays; 
public class SearchIn2DArray{
    public static void main(String[] args){
        int[][] arr = {
            {1,3,4},
            {2,5,6,8},
            {12,223234,56,98},
            {79,68,688},
        };
        int target = 34;
        System.out.println(Arrays.toString(search(arr,target)));
        System.out.println(max(arr));
    }  

    static int[] search(int[][] arr, int target){
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                if(arr[row][col] == target){
                    return new int[]{row, col};
                }
            }        
        }
        return new int[]{-1,-1};
    }

    static int max(int[][] arr){
        int max = Integer.MIN_VALUE;
        for (int[] ints : arr){
            for(int element : ints){
                if(element > max){
                    max = element;
                }
            }
        }
        return max;
    }
}