import java.util.ArrayList;
public class MultiDimList{
    public static void main(String args[]){
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();


        //intialization
        for (int i = 0; i < 3; i++){
            list.add(new ArrayList<>());
        }
    
        //adding of elements
        for (int i = 0; i < 3; i++){
            for ( int j = 0; j < 3; j++){
                list.get(i).add(i*2*i);
            }
        }


    }
}