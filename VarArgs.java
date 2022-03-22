import java.util.*;
public class VarArgs{

    public static void main(String args[]){
        fun(1,2,3,3,4,5);
        multiple (10, 15,"Monisha","Mohan","Mini");
    }
    private static void multiple(int a, int b, String ...v){
        System.out.println(Arrays.toString(v));
    }
    private static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}