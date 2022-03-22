public class PascalTraingle{
    public static void main(String[] args){
      System.out.println(rowNum(3));
    }

    public static int rowNum(int n){
     int ans = 1 << (n-1);
     return ans;
    }
}