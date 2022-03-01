public class Shadowing{
    private static int x = 10;
    public static void main (String args[]){
     System.out.println(x);
     int x;
     x = 8;
     System.out.println(x);
     shadowing();
    }
    private static void shadowing(){
        System.out.println(x);
    }
}