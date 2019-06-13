import java.util.ArrayList;
import java.util.List;

public class Solution {


    public int numDecodings(String s) {
        String [] arr = s.split("");
        int count =0;
        return dfs( s, count,new StringBuilder(),0,new StringBuilder());


    }

    int dfs(String s, int count, StringBuilder code, int index, StringBuilder number){
        if(index==s.length()-1){
            System.out.println(code);
            return count+1;
        }
        for(int i =index;i<s.length();i++){
            number.append(s.charAt(i));
            String temp = getStringValue(Integer.parseInt(number.toString()));
            System.out.println(temp + "---------");
            if(temp!=null){
                code.append(temp);
                dfs(s.substring(1), count, code,i+1, number);

            }
            number.delete(i,i+1);
        }

        return count;

    }

    String getStringValue(int i ) {
        return i>0 && i<27 ? String.valueOf ((char)(i+64)):null;

    }



    public static void main(String[] args) {
        Solution s  = new Solution();
        System.out.println(s.numDecodings("26"));


    }
}
