import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
public class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i =0;i< nums.length;i++){
            if(mp.containsKey(nums[i]))
                mp.put(nums[i],mp.get(nums[i])+1);
            else
                mp.put(nums[i],1);
        }
        System.out.println(mp);
        Iterator it = mp.entrySet().iterator();

        while(it.hasNext()){
            Map.Entry pair = (Map.Entry)it.next();
            if ((Integer)pair.getValue()>= nums.length/2+1)
                return (Integer)pair.getKey();
        }
        return -1;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {3,3,2};
        System.out.println(s.majorityElement(nums));
    }
}
