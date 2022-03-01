// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

public class FirstLastElement{
    public static void main(String[] args) {
    }

    public int[] searchRange(int[] nums, int target) {
      int[] ans = {-1,-1};
      ans[0] = search(nums,target, true);
      if(ans != -1){
        ans[1] = search(nums, target, false);
      }
      return ans;
    }
    public int search(int[] nums, int target,boolean findStartIndex) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end){
            int mid = start + (end - start)/2;
  
            if(target < arr[mid]){
                end = mid - 1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
            // potential answer is found
             ans = mid;
             if (findStartIndex){
                 end = mid - 1;
             } else{
                start = mid + 1;
             }
            }
        }
        return ans;
    }
}