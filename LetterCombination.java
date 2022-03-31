//https://leetcode.com/problems/letter-combinations-of-a-phone-number/
import java.util.ArrayList;
import java.util.List;

public class LetterCombination{
    public static void main(String[] args) {
        pad("","12");
        padRet("","12");
        System.out.println( padCount("","12"));
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0';//this will convert '2' in to 2

        for(int i = (digit -1)*3; i < digit * 3 ; i++){
            char ch = (char)('a' + i);
            pad(p+ch,up.substring(1));
        }
    }

    static List<String> padRet(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        int digit = up.charAt(0) - '0';//this will convert '2' in to 2
        ArrayList<String> ans = new ArrayList<>();
        for(int i = (digit -1)*3; i < digit * 3 ; i++){
            char ch = (char)('a' + i);
            ans.addAll(padRet(p+ch,up.substring(1)));
        }
        return ans;
    }
    public static List<String> letterCombinations(String digits) {
       
        return padRet("", digits);
    }

    static int padCount(String p, String up){
        if (up.isEmpty()) {
            return 1;
        }

        int count = 0;
        int digit = up.charAt(0) - '0';// thisw will convert'2' into 2
        for (int i = (digit - 1)*3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            count = count + padCount(p+ch,up.substring(1));
        }
        return count;
    }
}