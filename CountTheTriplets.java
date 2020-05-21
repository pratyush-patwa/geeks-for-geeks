/* -----------------------Count The Triplets -----------------------------
Given an array of distinct integers. The task is to count all the triplets such that sum of two elements equals the third element.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. First line of each test case contains an Integer N denoting size of array and the second line contains N space separated elements.

Output:
For each test case, print the count of all triplets, in new line. If no such triplets can form, print "-1".

Constraints:
1 <= T <= 100
3 <= N <= 105
1 <= A[i] <= 106

Example:
Input:
2
4
1 5 3 2
3
3 2 7
Output:
2
-1

Explanation:
Testcase 1: There are 2 triplets: 1 + 2 = 3 and 3 +2 = 5
Testcase 2: There are no triplets hence -1

-------------------------------------------------------------------------------------- */
//THE SOLUTION //

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t>0){
	        int n = sc.nextInt();
	        int []arr = new int[n];
	        for(int i =0; i< n; i++){
	            arr[i] = sc.nextInt();     
	        }
	        System.out.println(getTriplets(arr,n));
	        t--;
	    }
	 }
   
   /*
   The Function getTriplets take the input array and its parameter
   and it returns the count of the triplets
   */
   
	 public static int getTriplets(int []arr, int n){
	    
      //To Sort The Array
      Arrays.sort(arr);
	    int count =0;
        
        //for i from n-1 (length of array-1 to take the last Index) till i>1
        
        for(int i=n-1; i>1; i--){
            int j = 0;   //Starting Index
            int k = i-1; //LastIndex -1
            while(j<k){
                // To Check if array[j:start element] + arr[ k :last element-1 ] == array[i :last element]
                if(arr[j]+arr[k] == arr[i]){
                    count++ ;
                    j++;
                    k--;
                }
                else if(arr[j]+arr[k] < arr[i])
                    j++;
                else
                    k--;
            }

        }
      
      //To check if the triplet is present or not 
      
      if(count != 0)  return count;
	    else    return -1;
	 }
}













