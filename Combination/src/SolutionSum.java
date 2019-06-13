import java.util.ArrayList;
import java.util.List;

public class SolutionSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        dfs(candidates,target,results,new ArrayList(),0,0);
        return results;

    }

    public void dfs(int [] candidates, int target, List<List<Integer>> results, List<Integer> subset, int sum, int index){
        if(target==0){
            results.add(new ArrayList<>(subset));
            return ;
        }
        if(target<0)
            return;
        for(int i =index;i<candidates.length;i++){
            sum+=candidates[i];
            subset.add(candidates[i]);
            dfs(candidates,target,results,subset,sum,i);
            subset.remove(subset.size()-1);
            sum-=candidates[i];
        }
    }
}
