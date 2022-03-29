public class RotatedBinarySearch{
    public static void  main(String[] args){
        int[] arr = { 5,6,7,8,1,2,3,4};
        System.out.println(rotatedBinarySearch(arr, 8, 0, arr.length-1));
    }
    private static int rotatedBinarySearch(int[] arr,int target,int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }

        if(arr[s] <= arr[m]){

            if(target >= arr[s] && target <= arr[m]){
                return rotatedBinarySearch(arr, target, s, m-1);
            }else{
                return rotatedBinarySearch(arr, target, s+1, e);
            }
        }
        if(target >= arr[m] && target <= arr[e]){
            return rotatedBinarySearch(arr, target, m+1, e);
        }
        return rotatedBinarySearch(arr, target, s, m-1);
    }
}