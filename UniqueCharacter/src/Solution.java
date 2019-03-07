import java.util.HashMap;
import java.util.LinkedHashMap;


public class Solution {
    public int firstUniqChar(String s) {
       /* if (s.equals(""))
            return -1;
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        char [] arr = s.toCharArray();
        for (char i : arr) {
            if (map.containsKey(i)) {
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i]) && map.get(arr[i])==1)
               return i;
        }

        return -1;*/
        int [] countArray = new int[256];
        for(int i = 0; i < s.length(); i++){
            countArray[s.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++) {
            if (countArray[s.charAt(i)] > 0)
                System.out.print(countArray[i]);
        }
        return -1;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.firstUniqChar("aaabcdghj"));
    }

}
