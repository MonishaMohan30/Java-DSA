public class EnhancedSwitchExp{

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number");
        int day = input.nextInt();
        
        switch(day){
            case 1, 2, 3, 4, 5 -> System.out.println("Week days");
            case 6, 7 -> System.out.println("Week ends");
        }
    }
}