public class Greeting{
    public static void main(String args[]){
        greeting ();
        System.out.println(myGreet("MONI"));
    }
    static void greeting(){
        System.out.println("Hello World!!!");
    }
    static String myGreet(String name){
        String message = "Hello  " + name;
        return message;
    }
}