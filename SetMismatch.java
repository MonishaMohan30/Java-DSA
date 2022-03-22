// https://leetcode.com/problems/set-mismatch/
public class SetMismatch{
    public static void main(String[] args) {
        
    }

    pub
} public int[] findErrorNums(int[] nums) {
    int i = 0;
    
    while(i < nums.length){
        if(nums[i] != i + 1){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else{
                i++;
            }
        }else{
            i++;
        }
    }
    return search(nums);
  }
  
  public void swap(int[] nums, int first, int second){
      int temp = nums[first];
      nums[first] = nums[second];
      nums[second] = temp;
  }
  
  public int[] search(int[] nums){
      int[] set = new int[]{nums.length};
     
      for(int i = 0; i < nums.length; i++){
          if(nums[i] != i+1){
           set = new int[]{nums[i],i+1};
          
          }
      }
      return set;
  }
}