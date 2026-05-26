package DynamicProgramming;

// Problem statement: https://takeuforward.org/data-structure/dynamic-programming-frog-jump-with-k-distances-dp-4

import java.util.Arrays;

public class FrogJumpWithKDistance {
    public int operationRecursive(int []heights, int idx, int k){

//        TC: O(n * k) , SC: O(n) -> Stack Space
//        We can take up to k jumps, so check k jumps
        if(idx == 0){
            return 0;
        }

        int minSteps = Integer.MAX_VALUE;
        for(int j = 1; j <= k; j++){
            // check if we can take idx-j jump
            if(idx - j >= 0){
                int jump = Math.abs(heights[idx] - heights[idx - j]) + operationRecursive(heights, idx - j, k);
                minSteps = Math.min(minSteps, jump);
            }
        }

        return minSteps;
    }

    public int operationMemo(int []heights, int k, int idx, int []dp){

        if(idx == 0){
            return 0;
        }

        if(dp[idx] != -1){
            return dp[idx];
        }

        int minSteps = Integer.MAX_VALUE;

        for(int j = 1; j <= k; j++){
            if(idx - j >= 0){
                int jump = Math.abs(heights[idx] - heights[idx - j]) + operationMemo(heights , k, idx - j, dp);
                minSteps = Math.min(minSteps, jump);
            }
        }

        return dp[idx] = minSteps;
    }

    // skip as it will take same time and space as memoization approach
    public int operationTab(){
        return 0;
    }
}
