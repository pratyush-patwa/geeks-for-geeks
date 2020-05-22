/* --------------------------------------------------------------------------------------------------------------
Given an array A of size N containing 0s, 1s, and 2s; you need to sort the array in ascending order.

Input:
The first line contains an integer 'T' denoting the total number of test cases. Then T testcases follow. Each testcases contains two lines of input. The first line denotes the size of the array N. The second lines contains the elements of the array A separated by spaces.

Output: 
For each testcase, print the sorted array.

Constraints:
1 <= T <= 500
1 <= N <= 106
0 <= Ai <= 2

Example:
Input :
2
5
0 2 1 2 0
3
0 1 0

Output:
0 0 1 2 2
0 0 1

Explanation:
Testcase 1: After segragating the 0s, 1s and 2s, we have 0 0 1 2 2 which shown in the output.
	
	---------------------------------------------------------------------------*/



import java.util.*;
import java.lang.*;
import java.io.*;
class DutchFlag
 {
	public static void main (String[] args)
	 {
	  Scanner sc = new Scanner(System.in);
  	  int t = sc.nextInt();
          while(t>0){
            int n = sc.nextInt();
            
	    // Taking Input from the User	  
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
		  
	    // Method sortArray method Called  and it returned an array which is stored in int[] Sorted	  
            sortArray(arr, n);
		  
	    // For-Each Loop used to print the Returned Sorted Array	  
            for(int j: arr){
                System.out.print(j + " ");
            }
            System.out.println();
            t--;
        }
    }
    public static void sortArray(int [] arr, int n){
    	//Defined three counter variable to count the occurence of 0, 1 and 2 
	int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
	/* Using Swith Case to check the element of array 
	   if it is 0 incrementing count0
	   if it is 1 incrementing count1
	   if it is 2 incrementing count2
	 */
	    
        for(int i=0; i<n; i++){
            switch (arr[i]) { 
            case 0: 
                count0++; 
                break; 
            case 1: 
                count1++; 
                break; 
            case 2: 
                count2++; 
                break; 
            } 
        }
	
        int k =0;
	
	//running a loop for entering 0 in array 
        while(count0>0){
            arr[k] = 0;
            k++;
            count0--;
        }
	    
	//running a loop for entering 1 in array    
        while(count1>0){
            arr[k] = 1;
            k++;
            count1--;
        }
	    
	//running a loop for entering 2 in array 
        while(count2>0){
            arr[k] = 2;
            k++;
            count2--;
        }
    }
}
