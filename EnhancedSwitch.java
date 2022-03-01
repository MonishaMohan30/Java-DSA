import java.util.Scanner;

public class EnhancedSwitch{

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a fruit");
        String fruit = input.next();

        switch(fruit){
            case "Apple" -> System.out.println("This is Apple");
            case "Orange" -> System.out.println("This is Orange");
            case "Mango" ->  System.out.println("This is Mango");
            default -> System.out.println("No fruits");
        }
        
    }
    
}