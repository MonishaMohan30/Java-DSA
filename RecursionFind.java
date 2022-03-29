import java.util.*;
public class RecursionFind{
   
    public static void main(String[] args){
      int[] arr = {1,2,3,4,5,8,8,8,8};
      System.out.println(find(arr,18,0));
      System.out.println(findIndex(arr,18,0));
      System.out.println(findIndexLast(arr,18,0));
      System.out.println(findIndexLast(arr,8,arr.length - 1));
      System.out.println(findAllIndex(arr,8,0));
      System.out.println(findAllIndexWithParameters(arr,8,0,new ArrayList<>()));
    }
    public static boolean find(int[] arr, int target,int index){
        if(index == arr.length ){
            return false;
        }
        return arr[index] == target || find(arr, target, index + 1);
    }

    private static int findIndex(int[] arr, int target,int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return findIndex(arr, target, index+1);
    }

    private static int findIndexLast(int[] arr, int target,int index){
        
        if(index == -1){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }

        return findIndexLast(arr, target, index-1);
    }


    static ArrayList<Integer> indexList = new ArrayList<>();
    private static  ArrayList<Integer> findAllIndex(int[] arr, int target,int index){
        if(index == arr.length){
            return indexList;
        }
        if(arr[index] == target){
            indexList.add(index);
        }

        return findAllIndex(arr, target, index+1);
    }
    
    private static  ArrayList<Integer> findAllIndexWithParameters(int[] arr, int target,int index,ArrayList<Integer> indexList){
        if(index == arr.length){
            return indexList;
        }
        if(arr[index] == target){
            indexList.add(index);
        }

        return findAllIndexWithParameters(arr, target, index+1,indexList);
    }
    
}