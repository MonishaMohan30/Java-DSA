public class ValidAnagram{
    public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        if (a.length().equals(b.length())) return true;

        Map<Character, Integer> amap = new HashMap<>();
        Map<Character, Integer> bmap = new Hashmap<>();

        for ( int i = 0; i < a.length(); i++){
            amap.merge(a.charAt(i),1,Integer :: sum);
            bmap.merge(b.charAt(i),1,Integer :: sum);
        }

        for (Character c : amap.keySet()){
            if(!(amap.get(c).equals(bmap.get(c)))) return false;
        }
        return true;
    }


    public static void isAnagramArray(String a,String b) {
        if (a.length() != b.length()) return false;

        if (a.equals(b)) return true;

        int[] arr = new int[27];

        for(int i = 0; i < a.length(); i++ ){
            arr[a.charAt(i)-'a']++;
            arr[t.charAt(i)-'a']--;
        }

        for(int n : arr){
            if(n != 0) return false;
        }

        return true;
    }
} 