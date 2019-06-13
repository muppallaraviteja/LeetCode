public class Solution1 {


    public int minCostClimbingStairs(int[] cost) {
        int[] memo = new int[cost.length];
        memo[0] = cost[0];
        memo[1] = cost[1];

        return dfs(cost.length,cost,memo);
    }

    public int dfs(int n, int [] cost, int [] memo){
        for(int i=2;i<=n;i++){
            memo[i] = Math.min(memo[i-1]+cost[i-1],memo[i-2]+cost[i-2]);
        }
        return memo[n];
    }

}
