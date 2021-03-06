/*
Given an array C of size N-1 and given that there are numbers from 1 to N with one element missing, the missing number is to be found.

Input:
The first line of input contains an integer T denoting the number of test cases. For each test case first line contains N(size of array). The subsequent line contains N-1 array elements.

Output:
Print the missing number in array.

Constraints:
1 ≤ T ≤ 200
1 ≤ N ≤ 107
1 ≤ C[i] ≤ 107

Example:
Input:
2
5
1 2 3 5
10
1 2 3 4 5 6 7 8 10

Output:
4
9

Explanation:
Testcase 1: Given array : 1 2 3 5. Missing element is 4.
*/



import java.util.*;
import java.lang.*;
import java.io.*;
class Missingnumber
 {
	public static void main (String[] args)
	 {
	    Scanner sc = new Scanner(System.in);
	    int t= sc.nextInt();
	    while(t>0){
	        int sum=0, missingNumber=0, total=0;
	        int n= sc.nextInt();
	        int []c = new int[n-1];
		 // Taking sum of the available elemnts in the array 
	        for(int i=0; i<n-1; i++){
	            c[i]= sc.nextInt();
	            sum += c[i];
	        }
		// calculating total of 1to n series with forumala (n*(n+1))/2    
	        total= (n*(n+1))/2;
		// Subtracting total of 1 to n  -  sum of available elements in array
	        missingNumber = total - sum; 
	        System.out.println(missingNumber);
	        t--;
	    }
	 }
}
