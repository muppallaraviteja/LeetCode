import java.util.*;


class Solution {
    Map<Character, String> map = new HashMap();
    Solution(){
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
    }

    public List<String> letterCombinations(String digits) {
        List<String> li = new ArrayList();
        if(digits.length()==0)
            return li;
        char [] digit_arr =  digits.toCharArray();
        dfs(li,digit_arr,0,"");
        return li;
    }


    void dfs(List<String> li, char[] arr, int index, String s){
        if(s.length()==arr.length)
            li.add(s);
        for(int i=index;i<arr.length;i++){
            String temp = map.get(arr[i]);
            for(String k: temp.split("")){
                dfs(li,arr,i+1,s+k);
            }

        }
    }


}
