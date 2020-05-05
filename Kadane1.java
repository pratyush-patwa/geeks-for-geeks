import java.lang.*;
import java.io.*;
class Kadane1{
	public static void main (String[] args){
	    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t>0){
            int n = sc.nextInt();
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            System.out.println(getMaxSum(arr, n));
            t--;
	    }
	}
	
	public static int getMaxSum(int []arr, int n){
	    
	    int sum =0;
	    int maxSum = -99999;
	    for(int i=0; i<n; i++){
	        for(int j=i; j<n; j++){
	        sum += arr[j];
	        maxSum = (maxSum > sum ? maxSum : sum);
	        }
	        sum =0;
	    }
	    return maxSum;
	}
}
