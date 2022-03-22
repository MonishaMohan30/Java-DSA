//https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/submissions/

import java.util.*;
public class AllDisappearedNumbers {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if( nums[i] != nums[correct]){
                swap(nums,i, correct);
            }else{
                i++;
            }
        }
       return search(nums);   
    }
    
    public  void swap(int[] nums,int first,int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
    
    public   List<Integer> search(int[] nums){
        List<Integer> disappearedNumber = new ArrayList<>();
       for(int i = 0; i < nums.length; i++){
           if(i + 1 != nums[i]){
             disappearedNumber.add(i +1);
           }
       }
    
     return disappearedNumber;
    }
}