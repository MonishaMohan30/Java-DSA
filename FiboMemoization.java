import java.util.*;

public class FiboMemoization{
    
    /**
     * @param n
     * @param memo
     * @return
     */
    public static int fibo(int n,Map<Integer,Integer> memo) {
       if(memo.containsKey(n)) return memo.get(n);
       
       if(n<=2) return 1;
       memo.put(n, fibo(n-1, memo) + fibo( n -2, memo));
       return memo.get(n);
        
    }
    public static void main(String args[]) {
        System.out.println(fibo(1, new HashMap<Integer,Integer>()));
        System.out.println(fibo(3, new HashMap<Integer,Integer>()));
        System.out.println(fibo(4, new HashMap<Integer,Integer>()));
        System.out.println(fibo(5, new HashMap<Integer,Integer>()));
        System.out.println(fibo(7, new HashMap<Integer,Integer>()));
    }
}