import java.util.Arrays;

public class SwapArr{
    public static void main(String[] args){
        int[] arr = {1,3, 5,76,89,44};

        reverse(arr);
        System.out.println(Arrays.toString(arr));
    
    }
    static void swap(int[] arr,int index1, int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void swapInRange(int[] arr, int start, int end){
        for(int i = start; i < end; i++){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }

    static int max(int[] arr){
        if (arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > maxVal){
              maxVal = arr[i];
            }
        }
        return maxVal;
    }
    
    static int maxRange(int[] arr,int start, int end){
        int maxVal = arr[start];
        
        if(end < start){
            return -1;
        }

        if(arr == null){
            return -1;
        }
        for(int i = start; i <= end; i++){
            if(arr[i] > maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }

    static void reverse (int[] arr){
        int start = 0;
        int end = arr.length-1;

        while(start < end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
}