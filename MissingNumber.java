import java.util.Arrays;
public class MissingNumber{

    public static void main(String[] args){
        int[] arr = {5 ,4,3,1,0};
       
        System.out.println( missingNumber(arr));
    }

    public static int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correct]){
                swap(nums,i, correct);
            }else{
                i++;
            }
        }
       return search(nums);
    }
    public static void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public static int search(int[] nums){
       for(int i = 0; i < nums.length; i++){
           if(i != nums[i]){
               return i;
           }
       }
     return nums.length;
    }
}