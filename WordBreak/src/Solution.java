import java.util.*;

class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> wordDictSet=new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDictSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];

    }

    public static  void main(String[] args) {
        String s = "aaaaaaa";
        List<String> li  = new ArrayList<>();
        li.add("aaaa");
        li.add("aaa");
        //li.add("rs");


        Solution so = new Solution();
        System.out.println(so.wordBreak(s,li));


    }

    /* StringBuilder sb = new StringBuilder();
        sb.append(s);
        for(String i:wordDict ) {
            if(sb.length()==0)
                return true;

            while(sb.indexOf(i)!=-1)
                sb.delete(sb.indexOf(i),sb.indexOf(i)+i.length());
        }
        return sb.length()==0;*/
/*-------------------------------------------------------------------------------------------------------------------------------------*/
    /*   String st=s,st2=s;

        for(int i =0; i< st.length(); i++)
        {
            // getting substrings in linear time in forward way and checking if it exists in the list and
            // hence removing that substring from the string.
            if(wordDict.contains(st.substring(i)))
            {
                st = new String(st.substring(0,i));
                i=-1;
            }
        }
        // after iteration if the words are in the list the string shhould be reduced into empty string.
        if("".equals(st)){
            return true;
        }

        // generating substrings in the backward approach, it is used only if the forward substrings are not able to generate strings cuts in the optimal manner.
        for(int i =0; i< st2.length(); i++)
        {
            if(wordDict.contains(st2.substring(st2.length() - i-1)))
            {
                st2 = new String(st2.substring(0,st2.length() - i-1));
                i=-1;
            }
        }

        if("".equals(st2)){
            return true;
        }

        return false;*/

    /*---------------------------------------------------------------------------------------------------*/
    /*
     public boolean wordBreak(String s, List<String> wordDict) {
       return word_break(s,new HashSet(wordDict),0);
       }

    public boolean word_Break(String s, Set<String> wordDict, int start) {
       for(int i =start+1;i<=s.length();i++){
       if(start=s.length())
         return true;
       if(wordDict.contains(s.substring(start,i)&& word_Break(String s, wordDict, int start))
             return true;

       }

       return false;



    */
}