class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        String substring="";
        for (int i=1;i<=s.length()/2;i++){
            if(length%i==0){
                substring = s.substring(0,i);
                int max =s.length()/substring.length();
                String temp =substring;
                for(int j=0;j<=max-1;j++)
                    temp+=substring;
                if(temp.contains(s)&&s.length()!=substring.length())
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.repeatedSubstringPattern("abcabcabcabc"));
    }
}