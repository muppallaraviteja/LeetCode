import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> results = new ArrayList<>();
        String [] arr = new String[2*n];
       /* for(int i=0;i<2*n;i+=2){
            arr[i] = "(";
            arr[i+1] = ")";
        }*/
        dfs(results,"",0,0,n);

        return results;
    }

    void dfs(List<String> results,String str, int open, int close, int max){
        if(str.length()==2*max )
            results.add(str);
        if(open<max){
            str+= "(";
            dfs(results,str,open+1,close,max);
        }
        if(close<open){
            str+=")";
            dfs(results,str,open, close+1,max);
        }

    }



    public static void main(String[] args) {

    }

}
