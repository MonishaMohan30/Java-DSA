import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension{
    public static void main(String args[]){
      int[][] arr = new int[3][3];
      input(arr);
      output(arr);
      printArr(arr);
      printUsingEnhancedFor(arr);
    }

    private static void input(int[][] arr){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the 2D array");
        for(int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                arr[i][j] = in.nextInt();
            }
        }
    }

    private static void output(int[][] arr){
        System.out.println("****************2D Array************************");
        for(int i = 0; i < arr.length; i++){
            for ( int j = 0; j < arr[i].length; j++){
                 System.out.print(arr[i][j]+"   ");
            }
          System.out.println();
        } 
    }
   
    private static void printArr(int[][] arr){
        for(int row = 0; row < arr.length; row++){
            System.out.println(Arrays.toString(arr[row]));
        }
    }

    private static void printUsingEnhancedFor( int[][] arr){
        for(int[] a : arr){
            System.out.println(Arrays.toString(a));
        }
    }
}