import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {

    public boolean isPalindrome(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.reverse();
        return s.equals(sb.toString());
    }

    public List<List<String>> partition(String s) {
        List<List<String>> results= new ArrayList<>();
        if(s.length()==0)
            return results;
        dfs(results,new ArrayList<>(),s);
        return results;

    }

    public void dfs(List<List<String>> results,List<String>list, String s){
        if(s.length()==0)
            results.add(new ArrayList<>(list));
        for(int i =0;i<s.length();i++){
            String sub = s.substring(0,i+1);
            if(isPalindrome(sub)){
                list.add(sub);
                dfs(results,list,s.substring(i+1));
                list.remove(list.size()-1);
            }
        }


    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.partition("aab"));
    }
}
