/*
Given a number N. Find the minimum number of operations required to reach N starting from 0. You have 2 operations available:

Double the number
Add one to the number

Example 1:

Input:
N = 8
Output: 4
Explanation: 0 + 1 = 1, 1 + 1 = 2,
2 * 2 = 4, 4 * 2 = 8


---------------------------------------------------------------------------------------------------------------------------*/

class Solution
{
    public int minOperation(int n)
    {
      if(n<=3)
            return n; 
       
       int[] dp = new int[n+1];
    
        for(int i=1;i<=n;i++){
            if(i%2==0)
                dp[i]=dp[i/2]+1;
            else
                dp[i]=dp[i-1]+1;
        }
    return dp[n];
    }
}
