import java.util.Arrays;

public class Solution {
    /*public boolean canJump(int[] nums) {
    int[] min_jump = new int[nums.length];
    Arrays.fill(min_jump,Integer.MAX_VALUE);
    min_jump[0] = 0;
    for(int i=1; i<nums.length;i++){
        for(int j=0;j<i;j++){
            if(j+nums[j]>=i)
                min_jump[i] = Math.min(min_jump[j]+1,min_jump[i]);
        }
    }
    return min_jump[nums.length-1]>0;

    }*/
    public boolean canJump(int[] nums) {
        boolean [] can_jump = new boolean[nums.length];
        if(nums.length==1)
            return true;
        if(nums[0]>0)
            can_jump[0] = true;

        for(int i=0;i<nums.length;i++){
            if(can_jump[i]) {
                int max = Math.min(i + nums[i], nums.length - 1);
                for (int j = i; j <= max; j++)
                    can_jump[j]=true;
            }

        }
        return can_jump[nums.length-1];
    }





    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums={1,0,1,0};
        System.out.println(s.canJump(nums));
    }
}
