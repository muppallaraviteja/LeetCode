import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        /*Arrays.sort(nums);
        List<Integer> li = new ArrayList<>();
        int cal=1;
        for(int i =0;i<nums.length;i++){
            if(nums[i]>cal) {
                while (cal < nums[i]) {
                    li.add(cal);
                    cal += 1;
                }
            }
             if(nums[i]==cal)
                cal+=1;

        }
        while(cal<=nums.length){
            li.add(cal);
            cal+=1;
        }
        return li;*/
        List<Integer> l = new ArrayList<Integer>();
        int count[] = new int[nums.length+1];
        for(int n : nums)
            count[n]++;

        for(int counter = 1; counter <= nums.length; counter++)
        {
            if(count[counter] == 0)
                l.add(counter);
        }
        return l;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums ={4,3,2,7,8,2,3,1};
        System.out.println(sol.findDisappearedNumbers(nums));
    }
}
