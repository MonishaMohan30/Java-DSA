//https://leetcode.com/problems/contains-duplicate/
public class ContainsDuplicate{
   public static void main(String[] args) {
    
   }

   public static boolean bruteForce(int[] nums) {
      for(int i = 0; i < nums.length; i++){
        for(int j = i+1; j < nums.length; j++){
            if(nums[i] == nums[j]) return true;
        }
      }
      return false;
   }

   public static boolean mapSln(int[] nums) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i=0; i < nums.length; i++){
        if (map.containsKey(nums[i])) return true;
        map.put(nums[i], i);
    }
     return false;
   }

   public static boolean setSln(int[] nums) {
     Set<Integer> set = new Set<>();

     for(int num : nums){
        if(!set.add(num)) return true;
     }
     return false;
   }
}