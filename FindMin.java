public class FindMin{
    public static void main(String[] args) {
        int[] nums = {23,44,55,66,87,11,13,45};
        System.out.println(min(nums));
    }

    //assume arr.length != 0
    //return the minimum value in the array
    static int min(int[] arr){
        int ans = arr[0];
        for(int i = 1; i < arr.length; i++){
            if(ans > arr[i]){
                ans = arr[i];
            }
        }
        return ans;
    }
    
}