public class SearchInRange{
    public static void main(String[] args){
        int[] nums = {3,4,5,6,7,1,2,9};
        int target = 1;
        System.out.println(linearSearch(nums,target,1,5));
    }
    static int linearSearch(int[] nums,int target,int start, int end){
        if(nums.length == 0){
            return -1;
        }
        for(int index = start; index <= end; index++){
           if(nums[index] == target){
               return index;
           }
        }
        return -1;
    }
}