import java.util.Scanner;

import javafx.print.PrintColor;

public class NestedSwitch{
    public static void main(String args[]){
         
         Scanner in = new Scanner(System.in);
         System.out.println("Enter the employee id:");
         int empId = in.nextInt();
         System.out.println("Enter the department");
         String department = in.next();

         switch (empId){
             case 1 : 
               System.out.println("Hi first employee");
               break;
             case 2 :
               System.out.println("Hi second employee");
               break;
             case 3 :
               System.out.println("Hi third employee");
               break;
            case 4 :
              System.out.println("Hi fourth employee");
            switch(department){
                case "Civil" :
                   System.out.println("This is Civil department");
                   break;
                case "Mechanical" :
                   System.out.println("This is Mechanical department");
                   break;
                case "CSE" :
                   System.out.println("This is Computer Science department");
                   break;
                case "IT" :
                   System.out.println("This is Information Technology department");
                   break;
                case "ECE" :
                   System.out.println("This is Electronics Communication department");
                   break;
                case "EEE" :
                   System.out.println("This is Electrical Electronics department");
                   break;
                default :
                   System.out.println("Invalid department");
            }
                break;
            default :
              System.out.println("Invalid user");
         }
    }
}