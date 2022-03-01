import java.util.*;
public class ArrayListExp {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(2233);
        list.add(233);
        list.add(233);
        list.add(23333); 
        list.add(236);
        list.add(2345);

        System.out.println(list);
        list.set(0 , 45);

        System.out.println(list);
        
        list.remove(1);

        System.out.println(list);
    }
}