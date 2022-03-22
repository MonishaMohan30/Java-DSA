import java.util.*;
public class Operators{
    public static void main(String[] args) {
      System.out.println('a'+'b');
      System.out.println('a'+ 3);  
      System.out.println("a"+"b");  
      System.out.println((char)('a'+ 3)); 
      System.out.println("a"+ 3); //integer will be converted into Integer that will call toString()     
      System.out.println("Moni"+ new ArrayList<>() );
      System.out.println("Moni"+ new Integer(23) );
      String ans = (new ArrayList<>() +" "+ new Integer(23) );
      System.out.println(ans);
      System.out.println((new ArrayList<>() +" "+ new Integer(23) ));
    }
}