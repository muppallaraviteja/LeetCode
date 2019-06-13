import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
       List<List<Integer>> results = new ArrayList<>();
       dfs(results, new ArrayList<>(),nums);
       return results;
    }

    public void dfs(List<List<Integer>>results, List<Integer> list, int[]nums){
        if(list.size()==nums.length) {
            results.add(new ArrayList<>(list));
        }
        for(int i = 0;i<nums.length;i++){
            if(!list.contains(nums[i])) {
                list.add(nums[i]);
                dfs(results, list, nums);
                list.remove(list.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={1,2,3};
        List<List<Integer>> x = s.permute(nums);
        System.out.println(x);
    }
}
