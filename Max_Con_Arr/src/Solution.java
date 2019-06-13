class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            for(int j=i;j<nums.length;j++){
                if(temp>temp+nums[j])
                    break;
                else
                    temp+=nums[j];

            }
            if(temp>max)
                max = temp;

        }

        return max;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(s.maxSubArray(nums));
    }
}
