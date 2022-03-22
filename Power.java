public class Power{
    public static void main(String[] args){
     System.out.println(power());
    }


    public static int power(){
        int base = 3;
        int power = 6;
        int ans = 1;

        while(power > 0){
           if((power & 1) == 1){
               ans *= base;
           }
           base *= base;
           power = power>>1;
        }
        return ans;
    }
}