public class SubArraySum{
     public static void main(String args[]){
        int a[] = {1, 5, 3, 2};
        int 
         = 12;
       
        //subArraySum(a,s);
        tripletArray(a);
     }
     public static void subArraySum(int a[], int s){
        int left = 0;
      
        int n = a.length;
        while (left < n ){
            int sum = a[left];
            int right = left + 1;
            while (right>left && right< n){
                sum += a[right];
               
                if(s == sum){
                    System.out.println(left+ " :) Got it Success :) "+right);
                    return;
                }else{
                 right ++ ;
                }
            }left++;
        }
     }

     public static void tripletArray(int a[]) {
         int left = 0;
         int n = a.length;
        
         while (left < n){
            int triplet = 0;
             int right = left + 1;
             while(right > left && right < n){
                 triplet += a[left] + a[right];
                 if (triplet == a[left] || triplet == a[right] || ( right != n && triplet == a[right+1])){
                     System.out.println(left + " come on :)" +right);
                 }right++;
             }left++;
         }
         
     }
}


// Given an unsorted array A of size N that contains only non-negative integers, 
// find a continuous sub-array which adds to a given number S.

// Input:
// N = 5, S = 12
// A[] = {1,2,3,7,5}
// Output: 2 4
// Explanation: The sum of elements 
// from 2nd position to 4th position 
// is 12.

// Given an array of distinct integers. 
// The task is to count all the triplets such that sum of two elements equals the third element.

// Input:
// N = 4
// arr[] = {1, 5, 3, 2}
// Output: 2
// Explanation: There are 2 triplets: 
// 1 + 2 = 3 and 3 +2 = 5 