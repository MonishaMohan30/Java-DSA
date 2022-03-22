public class BSWithRecursion{
    public static void main(String[] args){
        int[] arr = {2,3,9,12,15,16,17};
        System.out.println(search(arr,9,0,arr.length-1));
    }

    public static int search(int[] arr, int target, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = start + (end - start)/2;
        
        if(arr[mid] == target){
            return mid;
        }
        if(arr[mid] < target){
            return search(arr,target,mid + 1, end);
        }

        return search(arr, target, start, mid - 1);
    }
}