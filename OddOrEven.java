public class OddOrEven{
    public static void main(String[] args){
        System.out.println(oddOrEven(68));
    }
    public static String oddOrEven(int n){
        return (n & 1) == 1 ? "ODD" : "EVEN"; 
    }
}