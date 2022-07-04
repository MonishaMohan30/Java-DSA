public class Fibo2NComplexity{
    public static void main(String args[]) {
        System.out.println(fibbo(1));
        System.out.println(fibbo(2));
        System.out.println(fibbo(3));
        System.out.println(fibbo(5));
        System.out.println(fibbo(7));
    }

    public static int fibbo(int n) {
        if(n <= 2) return 1;
        return fibbo(n-1) + fibbo(n-2);
    }
}