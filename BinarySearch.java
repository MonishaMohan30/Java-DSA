public class BinarySearch{
    public static void main(String[] args) {
      int[] arr = {2,3,57,678,33465,7688466,3242454};
      int target = 57;
      System.out.println(binarySearch(arr,target));
    }

    // return the index
    // return -1 if it does ot exist
    static int binarySearch(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            // find the middle element
            // int mid = (start + end) / 2; // might be possible that (start + end) exceed the range of integer in java
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if(target > arr[mid]){
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}