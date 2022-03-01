public class FindPosition{
    public static void main(String[] args) {
        
    }
    public static int findingRange(int[] arr,int target){
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while(target > end){
            int newStart = end +1;
            //double the range 
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return findPositio(arr,target, start, end);
    }
    public static int findPosition(int[] nums, int element,int start,int end){

        while(start <= end){
            int mid = start + (end-start)/2;
            if(element < arr[mid]){
                end = mid - 1;
            }else if(element > arr[mid]){
                start = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}