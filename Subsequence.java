import java.util.ArrayList;

public class Subsequence{
    public static void main(String[] args){
      subseq("", "abc");
      System.out.println(subseqList("", "abc", new ArrayList<String>()));
      System.out.println(subseqRet("", "abc"));
    }

    private static void subseq(String p, String up) {
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subseq(p+ch, up.substring(1));
        subseq(p, up.substring(1));
        
    }


    private static ArrayList<String> subseqList(String p, String up,ArrayList<String> subSeqList) {
        if(up.isEmpty()){
            return subSeqList;
        }
        char ch = up.charAt(0);
        //subSeqList.add(p);
        subSeqList.add(p + ch);
        subseqList(p+ch, up.substring(1),subSeqList);
        subseqList(p, up.substring(1),subSeqList);
        return subSeqList;
    }

    private static ArrayList<String> subseqRet(String p, String up) {
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subseqRet(p+ch, up.substring(1));
        ArrayList<String> right = subseqRet(p, up.substring(1));
        
        left.addAll(right);
        return left;
    }
}