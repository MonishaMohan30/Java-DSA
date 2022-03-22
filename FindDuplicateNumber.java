// https://leetcode.com/problems/find-the-duplicate-number/
import java.util.*;
public class FindDuplicateNumber{
    public static void main(String[] args){
        int[] arr = {5 ,4,3,1,1,2};
       
        System.out.println( findDuplicates(arr));
    }

    public static int findDuplicate(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
            if(nums[i] != i + 1){
                int correct = nums[i] - 1;
                if(nums[i] != nums[correct]){
                    swap(nums,i,correct);
                }else{
                    i++;
                }
            }else{
                i++;
            }
        }
        return search(nums);
    }
    
    public static void swap(int[] nums,int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public static int search(int[] nums){
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                return nums[i];
            }
        }
        return nums.length;
    }
}