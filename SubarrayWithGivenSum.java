/*    ..............................................................................................
Given an unsorted array A of size N of non-negative integers, find a continuous sub-array which adds to a given number S.

Input:
The first line of input contains an integer T denoting the number of test cases. Then T test cases follow. Each test case consists of two lines. The first line of each test case is N and S, where N is the size of array and S is the sum. The second line of each test case contains N space separated integers denoting the array elements.

Output:
For each testcase, in a new line, print the starting and ending positions(1 indexing) of first such occuring subarray from the left if sum equals to subarray, else print -1.

Constraints:
1 <= T <= 100
1 <= N <= 107
1 <= Ai <= 1010

Example:
Input:
2
5 12
1 2 3 7 5
10 15
1 2 3 4 5 6 7 8 9 10
Output:
2 4
1 5

Explanation :
Testcase1: sum of elements from 2nd position to 4th position is 12
Testcase2: sum of elements from 1st position to 5th position is 15

........................  */


import java.util.*;
import java.lang.*;
import java.io.*;
class SubarrayWithGivenSum
 {
	public static void main (String[] args)
	{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            int sum = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int result = getSubArrayIndex(arr, n, sum);
            if(result == -1) System.out.println(result);
            
            t--;
        }
    }
    
    public static int getSubArrayIndex(int arr[], int n, int sum){
        // Taking a pointer
        int pointer=0;
        // taking curr sum to 0
        int curr_sum =0;
        // for i=0 to n
        for(int i =0; i<n; i++){
            
            // adding arr[i] t current sum
            curr_sum += arr[i];
            
            // if curr_sum > sum decrease it by arr[pointer] and update pointer
            while(curr_sum>sum){
                curr_sum -= arr[pointer];
                pointer++;
            }
            //finally check for the sum if it is equal to current sum then print  
            if (curr_sum == sum){
                System.out.println((pointer+1) +" "+ (i+1));
                return 0;
            }
        }
        // returning -1 if not found the sum
        return -1;
    }
}
