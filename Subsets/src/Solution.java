import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if(nums.length==0 || nums ==null)
            return results;
        dfs(results, new ArrayList<Integer>(),0, nums);
        return results;
    }

    public void dfs(List<List<Integer>>results, List<Integer> subset,int index,int[]nums){
        results.add(new ArrayList<>(subset));

        for(int i =index;i<nums.length;i++){

            subset.add(nums[i]);
            dfs(results,subset,i+1,nums);
            subset.remove(subset.size()-1);
        }

    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {1,2};
        s.subsets(nums);
    }
}
