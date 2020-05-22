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
            
            int[] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }
            int []sorted = sortArray(arr, n);
            for(int j: sorted){
                System.out.print(j + " ");
            }
            System.out.println();
            t--;
        }
	}
    public static int[] sortArray(int [] arr, int n){
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        
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
        int []output = new int[n];
        int k =0;
        while(count0>0){
            output[k] = 0;
            k++;
            count0--;
        }
        while(count1>0){
            output[k] = 1;
            k++;
            count1--;
        }
        while(count2>0){
            output[k] = 2;
            k++;
            count2--;
        }
    return output;
    }
}