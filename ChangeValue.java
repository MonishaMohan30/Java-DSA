import java.util.Arrays;

public class ChangeValue{
    public static void main (String args[]){
        int[] arr = {1,2,3,4,5};
        changeValue(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void changeValue(int[] arr){
        arr[0] = 6;
    }
}