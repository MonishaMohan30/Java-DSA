public class LinearSearch {
    public static void main(String[] args){
      int[] nums = {23,45,67,88,55,56};
      int target = 945;
      int ans = linearSearch(nums,target);
      System.out.println(ans);
    }
    // search in the array: return the index if item found
    // otherwise if item not found return -1
    static int linearSearch(int[] arr,int target){
        if (arr.length == 0){
            return -1;
        }

        //run a for loop
        for (int index = 0; index < arr.length; index++){
            //check for element at every index
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //if  none element is found 
        return -1;
    }
} 