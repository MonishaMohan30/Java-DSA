// https://leetcode.com/problems/richest-customer-wealth/

public class MaxWealth{
    public static void main(String[] args){
        
    }
    
    public int maximumWealth(int[][] accounts) {
        //person = row
        // account = column
        int ans = Integer.MIN_VALUE;
        for ( int[] person : accounts){
            int rowSum = 0;
            for(int account : person){
                  rowSum += account;
            }
           if(rowSum > ans){
               ans = rowSum;
           }
        }
        return ans;
    }
}