import java.util.HashMap;
import java.util.Map;

public class GridTravelerMemoization{
    public static void main(String[] args) {
        System.out.println(numbOfWays(2,3,new HashMap<>()));
        System.out.println(numbOfWays(20,3,new HashMap<>()));
        System.out.println(numbOfWays(2,63,new HashMap<>()));
        System.out.println(numbOfWays(92,30,new HashMap<>()));
    }

    public static int numbOfWays(int m, int n, Map<String,Integer> memo) {
       String key = m+","+n;
         if(memo.containsKey(key)) return memo.get(key);
         if(m==1 && n==1) return 1;
         if(m==0 || n==0) return 0;

         memo.put(key,numbOfWays(m-1,n,memo)+numbOfWays(m,n-1,memo));
         return memo.get(key);
        
    }
}