// https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
public class EvenDigits {
    public static void main (String[] args){
      int[] nums ={1223,3342,444434,44323};
      //System.out.println(findNumbers(nums));
      System.out.println(digits2(-23443545));
    }

    static int findNumbers(int[] arr){
        int count = 0;
        for (int num : arr){
            if(even(num)){
                count++;
            }
        }
        return count;
    }
    static boolean even(int num){
        return digits(num) % 2 == 0;
    }

    static int digits(int num){
         int count = 0;
         if(num < 0){
             num = num * -1;
         }
         if(num == 0 ){
             return 1;
         }
         while(num > 0){
             count++;
             num = num/10;
         }
         return count;
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num)) + 1;
    }
}