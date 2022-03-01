public class Scope{
    public static void main(String args[]){
        int a = 10;
        {
            a = 20;
            int c = 30;
            System.out.println(a+" "+c);
        }
        System.out.println(a+" ");
    }
}