import java.util.Arrays;
public class InPlaceMergeSort{
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2,1};
        mergeSortInplace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInplace(int[] arr,int s,int e) {
        if((e-s) == 1){
            return;
        }
        int mid = (s + e)/2;

        mergeSortInplace(arr, s, mid);
        mergeSortInplace(arr,mid,e);

         mergeInplace(arr,s,mid,e);

       
    }

    private static void mergeInplace(int[] arr,int s, int mid, int e) {
       int[] mix =  new int[e-s];
       
       int i = s;
       int j = mid;
       int k = 0;


       while(i < mid && j < e){
           if(arr[i] < arr[j]){
               mix[k] = arr[i];
               i++;
           } else{
               mix[k] = arr[j];
               j++;
           }
           k++;
       }

       //it may be possible that one of the array is not complete
       //copy the remaining elements
       while(i < mid){
           mix[k] = arr[i];
           i++;
           k++;
       }

       while(j < e){
           mix[k] = arr[j];
           j++;
           k++;
       }
       
    //    for(int l =0; l < mix.length; l++){
    //        arr[s+l] = mix[l];
    //    }

    //optimizing the copy of mix
    System.arraycopy(mix,0,arr,s+0,mix.length);
  }
}