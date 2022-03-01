public class SearchInString {
    public static void main(String[] args){
        String name = "Monisha";
        char target = 'e';
        System.out.println(search(name, target));
        System.out.println(search1(name, target));
    }

    static boolean search(String str, char target){
        if(str.length() == 0){
            return false;
        }
        for(int i = 0; i < str.length(); i++){
            if(target == str.charAt(i)){
                return true;
            }
        }

        return false;
    }

    static boolean search1(String str,char target){
        if (str.length() == 0){
            return false;
        }

        for(char c : str.toCharArray()){
            if(c == target){
                return true;
            }
        }
        
        return false;
    }
}