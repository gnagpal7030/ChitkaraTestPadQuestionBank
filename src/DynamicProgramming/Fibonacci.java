package DynamicProgramming;

public class Fibonacci {
    public int operationMemo(int n, int []dp){
        if(n <= 1){
            return n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        return dp[n] = operationMemo(n-1, dp) + operationMemo(n-2, dp);
    }

    public int operationTab(int n){
        if(n <= 1){
            return n;
        }

        int []dp = new int[n + 1];

        dp[0] = 0;
        dp[1] = 1;

        for(int i = 2; i <= n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    public int operationTabWithoutSpace(int n){
        if(n <= 1){
            return n;
        }

        int firstNo = 0;
        int secondNo = 1;

        int res = 0;

        for(int i = 2; i <= n; i++){
            res = firstNo + secondNo;
            firstNo = secondNo;
            secondNo = res;
        }

        return res;
    }
}
