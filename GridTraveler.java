public class GridTraveler{
    public static void main(String[] args) {
        System.out.println(numbOfWays(2,3));
        System.out.println(numbOfWays(3,3));
        System.out.println(numbOfWays(3,2));
        System.out.println(numbOfWays(1,1));
        System.out.println(numbOfWays(3,30));
    }
    public static int numbOfWays(int m, int n) {
        if(m==1 && n==1) return 1;
        if(m==0 || n==0) return 0;
        return numbOfWays(m-1,n) + numbOfWays(m,n-1);
        
    }
}