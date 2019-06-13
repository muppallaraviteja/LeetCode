import java.util.HashMap;

class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<String, String> p_map = new HashMap<>();
        HashMap<String, String> s_map = new HashMap<>();

        String [] p_arr = pattern.split("");
        String [] st = str.split(" ");
        if(st.length!=p_arr.length)
            return false;
        for(int i=0;i<pattern.length();i++){
            if(p_map.get(p_arr[i])==null && s_map.get(st[i])==null){
                p_map.put(p_arr[i],st[i]);
                s_map.put(st[i],p_arr[i]);
            }
            else if(s_map.containsKey(st[i]) && !p_map.containsKey(p_arr[i]))
                return false;
            else if(!s_map.containsKey(st[i]) && p_map.containsKey(p_arr[i]))
                return false;
            else if(!p_map.get(p_arr[i]).equals(st[i]) || !s_map.get(st[i]).equals(p_arr[i]))
                return false;

            }

        return true;

    }
}
