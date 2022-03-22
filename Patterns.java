import java.util.Scanner;
public class Patterns{
    public static void main(String[] args){
      System.out.println("Enter the number of elements to be printed : ");
      Scanner s = new Scanner(System.in);
      int n = s.nextInt();
      pattern1(n);
      System.out.println();
      pattern2(n);
      System.out.println();
      pattern3(n);
      System.out.println();
      pattern4(n);
      System.out.println();
      pattern5(n);
      System.out.println();
      pattern28(n);

      System.out.println();
      pattern30(n);
      System.out.println();
      pattern17(n);
      System.out.println();
      pattern31(n);
      System.out.println();
      pattern32(n);
      System.out.println();
      pattern33(n);
      System.out.println();
      pattern34(n);
    }
    public static void pattern1(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= n; col++){
                System.out.print("* ");
            }
            System.out.println(); 
        }
    }
    public static void pattern2(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern3(int n){
        for(int row = 1; row <= n; row++){
            for(int col = n; col >= row; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        for(int row = 1; row <= n; row++){
            for(int col = 1; col <= row; col++){
                System.out.print(col+ " ");
            }
            System.out.println();
        }
    }

    public static void pattern5(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRows = row > n ?   2 * n -row : row;
            for(int col = 0; col <= totalColsInRows; col++){
                System.out.print( "* ");
            }
            System.out.println();
        }
    }
    public static void pattern28(int n){
        for(int row = 0; row < 2 * n; row++){
            int totalColsInRows = row > n ?   2 * n -row : row;

            int noOfSpaces = n -  totalColsInRows;
            for(int i = 0; i < noOfSpaces; i++){
                System.out.print( " ");
            }
            
            for(int col = 0; col < totalColsInRows; col++){
                System.out.print( " * ");
            }
            System.out.println();
        }
    }


    public static void pattern30(int n){
        for(int row = 1; row <= n; row++){
            for(int s = 0 ; s < n - row; s++){
                System.out.print(" ");
            }
            for(int col = row ; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= row ; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }

    public static void pattern17(int n){
        for(int row = 1; row <= 2*n; row++){
            int c = row > n ? 2*n -row:row;
            for(int s = 0 ; s < n - row; s++){
                System.out.print(" ");
            }
            for(int col = c ; col >= 1; col--){
                System.out.print(col);
            }
            for(int col = 2; col <= c ; col++){
                System.out.print(col);
            }

            System.out.println();
        }
    }
    public static void pattern31(int n){
        n = 2 * n;
        for(int row = 0 ; row <= n; row++){
           for(int col = 0; col <= n ; col++){
               int index = Math.min(Math.min(row, col), Math.min(n-row, n-col));
               System.out.print(index);
           }
           System.out.println();
        }
    }

    public static void pattern32(int n){
        int originalN = n;
        n = 2 * n;
        for(int row = 0 ; row <= n; row++){
           for(int col = 0; col <= n ; col++){
               int index = originalN - Math.min(Math.min(row, col), Math.min(n-row, n-col));
               System.out.print(index);
           }
           System.out.println();
        }
    }

    public static void pattern33(int n){
        n = 2 * n;
        for(int row = 0 ; row <= n; row++){
           for(int col = 0; col <= n ; col++){
               int index = Math.max(Math.max(row, col), Math.max(n-row, n-col));
               System.out.print(index);
           }
           System.out.println();
        }
    }

    public static void pattern34(int n){
        int originalN = n;
        n = 2 * n;
        for(int row = 0 ; row <= n; row++){
           for(int col = 0; col <= n ; col++){
               int index = originalN - Math.max(Math.max(row, col), Math.max(n-row, n-col));
               System.out.print(index);
           }
           System.out.println();
        }
    }
}