// https://leetcode.com/problems/find-all-duplicates-in-an-array/
import java.util.*;
public class FindDuplicateNumbers{
    public static void main(String[] args){
        int[] arr = {5 ,4,3,1,1,2};
       
        System.out.println( findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] nums) {
        int i = 0;
        
        while(i < nums.length){
         if(arr[i] != i+1){
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
      
      
      public static void swap(int[] nums, int first, int second){
          int temp = nums[first];
          nums[first] = nums[second];
          nums[second] =  temp;
      }
      
      public static List<Integer> search(int[] nums){
        List<Integer> duplicates = new ArrayList<>();
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != i + 1 ){
                duplicates.add(nums[i]);
            }
        }
        return duplicates;
      }
}