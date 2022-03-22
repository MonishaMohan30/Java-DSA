public class FindUniqueNumber{
    public static void main(String[] args){
        int[] arr = {2,3,4,5,3,4,2};
        System.out.println(findUniqueNumber(arr));
    }
    public static int findUniqueNumber(int[] arr){
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}