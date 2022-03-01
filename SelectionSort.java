import java.util.Arrays;
public class SelectionSort{
    public static void main(String[] args){
        int[] arr = {2,3,9,12,5,6,7};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length - i - 1;
            int max = getMaxIndex(arr,0,last);
            swap(arr,max,last);
        }
    }
    public static int getMaxIndex(int[] arr,int start,int last){
        int max = start;
        for(int i = start; i <= last; i++){
            if(arr[max] < arr[i]){
                max = i;
            }   
        }
        return max;
    }
    
    public static void swap(int[] arr,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}