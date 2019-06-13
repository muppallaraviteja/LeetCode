public class Solution {
   /* public int climbStairs(int n){
        if(n<=1)
            return 1;
        return climbStairs(n-1)+climbStairs(n-2);
    }
*/
    public int climbStairs(int n){
        int [] memo = new int[n+1];
        memo[0]=1;
        memo[1] = 1;
        return dfs(n, memo);
    }

    public int dfs(int n, int [] memo){
        if(memo[n]>0)
            return memo[n];
        memo[n] = dfs(n-1,memo)+ dfs(n-2,memo);
        return memo[n];


    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.climbStairs(3));
    }
}
