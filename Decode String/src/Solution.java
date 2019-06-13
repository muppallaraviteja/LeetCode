import java.util.HashMap;
import java.util.Map;

public class Solution {

    private static boolean cal(int k, String sub){
        HashMap<Character, Integer>map= new HashMap<>();
        char [] arr = sub.toCharArray();
        for(char c:arr){
            if(map.containsKey(c)){
                if(map.get(c)+1>k)
                    return false;
                else
                    map.put(c,map.get(c)+1);
            }
            else
                map.put(c,1);
        }

        for(Map.Entry check:map.entrySet()) {
            if ((int) check.getValue() != k)
                return false;
        }

        return true;

    }

    public static int perfectSubstring(String s, int k) {
        if(s.length()<k)
            return 0;
        int ans=0;
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
            for(int j=i+k;j<=s.length();j++){
                if(cal(k,s.substring(i,j))){
                    ans++;
                    System.out.println(s.substring(i,j));
                }
            }
        return ans;

    }


    public static void main(String[] args)
    {
        System.out.println(Solution.perfectSubstring("",  3));
    }

}
