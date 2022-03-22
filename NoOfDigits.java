public class NoOfDigits{
    public static void main(String args[]){
       System.out.println(noOfDigits(10));
    }

    public static int noOfDigits(int n){
        int b = 10;

        int ans = (int)(Math.log(n)/Math.log(b) ) + 1;

        return ans;
    }
}