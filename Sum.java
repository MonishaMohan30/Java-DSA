import java.util.Scanner;

public class Sum {
    public static void main (String args[]){
        System.out.println(sum1());
    }

    static int sum1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int num1 = in.nextInt();
        int num2 = in.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum is : "+sum);
    }
}