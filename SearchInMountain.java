public class SearchInMountain{
    public static void main(String[] args) {
        
    }
    public static int findPeakIndex(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if(target < arr[mid+1]){
                end = mid;
            }else if(target > arr[mid+1]){ 
                start = mid + 1;
            }
        }
        return start;   
    }
}