public class OrderAgnosticBS{
    public static void main(String[] args) {
        int[] arr = {19,17,15,10,9,6,7,8};
      int target = 15;
      System.out.println(orderAgnosticBS(arr,target));
    }

    static int orderAgnosticBS(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;

        //find whether the array is sorted in ascending or descendng
        boolean isAsc = arr[start] < arr[end];

        while(start <= end){
            int mid = start + (end - start)/2;
            
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(target < arr[mid]){
                    end = mid - 1;
                } else if(target > arr[mid]){
                    start = mid + 1;
                } 
            } else {
                if(target > arr[mid]){
                    end = mid - 1;
                } else if(target < arr[mid]){
                    start = mid + 1;
                } 
            }
            
        }
        return -1;

    }
}