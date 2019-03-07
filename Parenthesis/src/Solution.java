import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='}'||s.charAt(i)==']'||s.charAt(i)==')'){
                if(st.empty())
                    return false;
                char x =st.pop();
                if(x=='{' && s.charAt(i)=='}' ||x=='(' && s.charAt(i)==')'||x=='[' && s.charAt(i)==']')
                    continue;
                else
                    return false;
            }
            else
                st.push(s.charAt(i));
        }
       return st.empty();
    }

}
