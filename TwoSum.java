public class TwoSum{
    public static int[] twoSumBF(int[] nums,int target) {
       
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i] + nums[j] == target){
                   return new int[]{i,j};
                }
            }
        }
        return new int[]{-1, -1};
    }

    public static int[] twoSumMap(int[] nums,int target){
        Map<Integer,Integer> map = new HashMap<>();

        for (int i=0; i < nums.length; i++){
            if(map.containsKey(num[i])){
                return new int[]{map.get(num[i]),i};
            }
            map.put(target - nums[i],i);
        }
        return new int[]{-1,-1};
    }
}