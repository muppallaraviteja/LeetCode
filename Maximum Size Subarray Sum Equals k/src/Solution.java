import java.util.HashMap;

class Solution {
    public int maxSubArrayLen(int[] nums, int k) {
        int sum = 0;
        int max = 0;

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            map.put(sum,i+1);
            if(! map.containsKey(sum))
                map.put(sum,i);
            int prev = sum -k;
            if(map.containsKey(prev)){
                int temp = map.get(prev);
                max = Math.max(max, i-temp);
            }


        }
        return max;
    }
}
