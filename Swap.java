public class Swap {
    public static void main (String args[]){
        int a = 10;
        int b = 20;
        swap(a,b);

        System.out.print(a + "   "+b);

        String name ="Moni";
        changeName(name);
        System.out.println(name);
    }

    private static void swap (int a , int b){
        int temp = a;
        a = b;
        b = temp;
    }

    private static void changeName(String name){
        name = "Monisha Mohan";
        System.out.println(name);
    }
}