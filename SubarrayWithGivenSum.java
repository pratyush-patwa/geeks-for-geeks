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
