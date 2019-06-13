import java.util.HashMap;
import java.util.Hashtable;

class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int sum = 0;
        int max = Integer.MAX_VALUE;
      
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        for(int i = 0;i<nums.length;i++){
            sum+= nums[i];
            if(!map.containsKey(sum)) {
                map.put(sum, i);
            }
            int prev = sum -s;

            if(map.containsKey(prev)){
                int temp = map.get(prev);
                max = Math.min(max, i-temp);
            }


        }

        return max!=Integer.MAX_VALUE?max:0;
    }
   /* if(s<1)
            return 0;
        int max = Integer.MAX_VALUE;
        int start=0;
        int sum=0;
        for(int end = 0;end<nums.length;end++){
            sum+= nums[end];
            while(sum>=s && start<=end){
                max = Math.min(max, end-start+1);
                sum-= nums[start];
                start++;
            }



        }

        return max!=Integer.MAX_VALUE?max:0;

    }*/
}
