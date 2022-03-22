import java.util.Arrays;
public class StringMethods{
    public static void main(String[] args) {
        String name = "Monisha Mohan Hello World";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.trim());
        System.out.println(name.indexOf('a'));
        System.out.println(name.toLowerCase());
        System.out.println(name.lastIndexOf('a'));
       // System.out.println("  Mini   ".strip());
       System.out.println(Arrays.toString(name.split(" ")));

        
    }
}