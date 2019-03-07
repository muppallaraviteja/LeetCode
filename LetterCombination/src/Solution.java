import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;


class Solution {
    private Map<Character, String> createMap(){
        Map<Character, String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");

        return map;
    }
    public List<String> letterCombinations(String digits) {
        Map<Character, String> map = createMap();
        char [] arr = digits.toCharArray();

    return null;

    }
}
/*r [] arr= digits.toCharArray();
        Stack<String> permanent = new Stack<>();
        String item = map.get(arr[0]);
        for(int i=0;i<item.length();i++)
            permanent.push(item.substring(i,1));

        for(int i =1;i<arr.length-1;i++){
            Stack<String> temp = new Stack<>();
            item = map.get(arr[i]);
            for(int j=0;i<item.length();i++)
                temp.push(item.substring(j,1));

            while(!temp.empty()){

            }

        }*/