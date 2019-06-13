import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, new ArrayList<>(),n,k,1);
        return result;

    }


    void dfs(List<List<Integer>> result, List<Integer> subset, int n, int k, int index ){
        if(subset.size()==k){
            result.add(new ArrayList<>(subset));
            return;
        }
        for(int  i =index;i<=n;i++){
            subset.add(i);
            dfs(result, subset,n,k,i+1);
            subset.remove(subset.size()-1);
        }

    }
}
