import java.util.Arrays;

class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int x =0;
        for(int i  =0;i<nums.length/2;i++) {
            if (nums[i] != i) {
                return i;
            }
            else {
                x++;
            }

        }
        if(x==nums.length)
            return nums.length;
        return -1;
    }
}

