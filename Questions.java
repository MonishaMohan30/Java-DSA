import java.util.*;
public class Questions{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      System.out.println("Enter a number");
      int n = in.nextInt();
      System.out.println(isPrime(n));
      System.out.println(isArmStrong(n));
      System.out.println(isPallindrome(n));
      System.out.println("Anagram"+isAnagram("Monisha", "NishaMo"));

      for (int i = 100; i < 1000; i++){
          if(isArmStrong(i)){
              System.out.println(i);
          }
      }
    }

    private static boolean isArmStrong(int n){
        int original = n;
        int sum = 0;

        while(n > 0){
            int rem = n%10;
            n = n/10;
            sum = sum + rem * rem * rem;
        }
        return sum == original;
    }
    private static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        int c = 2;
        while(c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return c*c > n;
    }

    private static boolean isPallindrome(int n){
        int reverse = 0;
        int original = n;

        while (n>0){
            int rem = n%10;
            n = n/10;
            reverse = reverse * 10 + rem ;
        }
        System.out.println(reverse);
        return reverse == original;
    }

    private static boolean isAnagram(String w1, String w2){
       char[] a1 = w1.toCharArray();
       char[] a2 = w2.toCharArray();
    
       

       return Arrays.equals(a1, a2);
    }
}