import java.util.ArrayList;

public class Ascii{
    public static void main(String[] args){
        char ch = 'a';
        System.out.println(ch + 0);
        System.out.println((char)(ch + 0));
        subSeqAscii("", "abc");
        System.out.println(subSeqAsciiRet("", "abc"));
    }

    private static void subSeqAscii(String p, String up) {
       if(up.isEmpty()){
           System.out.println(p);
           return;
       }      
       char ch = up.charAt(0);
       subSeqAscii(p + ch, up.substring(1));
       subSeqAscii(p,up.substring(1));
       subSeqAscii(p + (ch + 0),up.substring(1));
    }

    private static ArrayList<String> subSeqAsciiRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }      
        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiRet(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiRet(p,up.substring(1));
        ArrayList<String> third = subSeqAsciiRet(p + (ch + 0),up.substring(1));

        first.addAll(second);
        first.addAll(third);

        return first;
     }
}