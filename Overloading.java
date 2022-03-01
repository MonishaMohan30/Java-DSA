public class Overloading {
    public static void main(String args[]){
        demo(10);
        demo(10,20);
        demo("Monisha");
        demo("Monisha","Mohan");
    }

    private static void demo(int a){
        System.out.println("First One");
        System.out.println(a);
    }

    private static void demo(int ...a){
        System.out.println("Second One");
        System.out.println(a[0]);
        System.out.println(a[1]);
    }

    private static void demo(String name){
        System.out.println("Third One");
        System.out.println(name);
    }

    private static void demo(String ...name){
        System.out.println("Fourth One");
        System.out.println(name[0]);
        System.out.println(name[1]);
    }
}