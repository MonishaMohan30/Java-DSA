public class PowerOfTwo{
    public static void main(String[] args){
     System.out.println(checkPowOfTwo(15));
    }

    public static String checkPowOfTwo(int n){
        return (n & (n-1)) == 0  ? "Yes" : "No";
    }
}