import java.util.HashMap;

class Solution {
    public boolean judgeCircle(String moves) {
        char[] arr=moves.toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('L',0);
        map.put('U',0);
        for (int i=0;i<arr.length;i++) {
            if (arr[i] == 'L')
                map.put('L', map.get('L') + 1);
            else if (arr[i] == 'R')
                map.put('L', map.get('L') - 1);
            else if (arr[i] == 'U')
                map.put('U', map.get('U') + 1);
            else if (arr[i] == 'D')
                map.put('U', map.get('U') - 1);

        }
        if(map.get('L')!=0 || map.get('U')!=0)
            return false;
        return true;


    }

    public static void main(String[] args) {
        Solution s=  new Solution();
        System.out.println(s.judgeCircle("UD"));
    }
}