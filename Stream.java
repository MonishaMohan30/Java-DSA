public class Stream{
  public static void main(String[] args) {
      skip("", "baccdah");
      System.out.println(skipAs("baccdah"));
      System.out.println(skipApple("bacapplecdah"));
      System.out.println(skipAppNotApple("bappcapplecdah"));
  }

  private static void skip(String p,String up){
      if(up.isEmpty()){
          System.out.println(p);
          return;
      }

      char ch = up.charAt(0);

      if(ch == 'a'){
          skip(p,up.substring(1));
      }else{
          skip(p+ch,up.substring(1));
      }
  }


  private static String skipAs(String up){
    if(up.isEmpty()){
        return "";
    }

    char ch = up.charAt(0);

    if(ch == 'a'){
       return skipAs(up.substring(1));
    }else{
        return ch + skipAs(up.substring(1));
    }
 }

 private static String skipApple(String up){
    if(up.isEmpty()){
        return "";
    }

    if(up.startsWith("apple")){
       return skipApple(up.substring(5));
    }else{
        return up.charAt(0) + skipApple(up.substring(1));
    }
 }

 private static String skipAppNotApple(String up){
    if(up.isEmpty()){
        return "";
    }

    if(up.startsWith("app") && !up.startsWith("apple")){
       return skipAppNotApple(up.substring(3));
    }else{
        return up.charAt(0) + skipAppNotApple(up.substring(1));
    }
 }
}