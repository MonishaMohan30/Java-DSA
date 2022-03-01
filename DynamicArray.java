public class DynamicArray{
    public static void main(String args[]){
        int[][] arr = {
            {1,2,3,4},
            {3,4,5},
            {8,9,0,2,3,7,9,1},
        };
        output(arr);
    }
    private static void output(int[][] arr){

        System.out.println("*******************************2D Array****************************************");
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr[row].length; col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
    }
}