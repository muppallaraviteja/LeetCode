import java.util.List;
import java.util.Stack;

class Solution {
    public List<String> generateParenthesis(int n) {
        String s= "()";

        return null;
    }
    public boolean validParenthesis(String s){
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==')'){
                if(st.empty())
                    return false;
                char x =st.pop();
                if(x=='(' && s.charAt(i)==')')
                    continue;
                else
                    return false;
            }
            else
                st.push(s.charAt(i));
        }
        return st.empty();
    }

    public static void main(String[] args) {

    }

}