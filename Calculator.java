    import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner input = new Scanner(System.in);
        // take input from the user till user enters x or X
        while (true){
            // take the operation from the user to perform
            System.out.println("Enter the operator");
            char op = input.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                //take input from the user
                System.out.println("Enter two numbers:");
                int a = input.nextInt();
                int b = input.nextInt();
                if(op == '+'){
                    ans = a + b;
                }
                if(op == '-'){
                    ans = a - b;
                } 
                if(op == '*'){
                    ans = a * b;
                }
                if(op == '/'){
                    if(b != 0)
                    ans = a/b;
                }
                if(op == '%'){
                    ans = a%b;
                } 
            }else if (op == 'x' || op == 'X'){
                break;
            }else{
                System.out.println("Invalid Operation!!!");
            }
            System.out.println(ans);
            
        }
        
    }
}