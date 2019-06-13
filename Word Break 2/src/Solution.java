import java.util.*;

class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> li = new ArrayList<>();
        Set<String> wordDictSet=new HashSet<>(wordDict);
        HashMap map = new HashMap();

        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++){
            String k="";
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    System.out.println(s.substring(j, i));
                    dp[i] = true;
                    break;
                }
                System.out.println();

            }
        }

        for(int i=0;i<dp.length;i++){
            System.out.print(dp[i] + " ");
        }

        return li;

    }


    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "leetcode";
        List<String> wordDict = new ArrayList<>();
        wordDict.add("leet");
        wordDict.add("code");
        wordDict.add("lee");
        wordDict.add("tcode");
        wordDict.add("is");

        System.out.println(sol.wordBreak(s,wordDict));

    }

/*
    public List<String> wordBreak(String s, List<String> wordDict) {
       return word_break(s,new HashSet(wordDict),0);
       }

    public List<String> word_Break(String s, Set<String> wordDict, int start) {
        List<String> res= new ArrayList();
        if(start=s.length())
            res.add("");
       for(int i =start+1;i<=s.length();i++){
         if(wordDict.contains(s.substring(start,i)){
            List<String> li = word_Break(String s, wordDict, i);
               for(String d : li){
                    r res.add(s.substring(start, end) + (l.equals("") ? "" : " ") + l
                    }
             }

       }

       return false;
*/

}
