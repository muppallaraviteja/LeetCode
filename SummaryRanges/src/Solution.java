import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<String> summaryRanges(int[] nums) {
        if (nums.length==0)
            return null;
        int first=0;
        int last=0;
        String s;
        List<String> li = new ArrayList<>();
        for(int i =1;i<nums.length;i++){  /*[0,2,3,4,6,8,9]*/
            if(nums[i]!=nums[i-1]+1){
                last=i-1;
                if(first!=last)
                    s = nums[first]+"->"+nums[last];
                else
                    s = nums[first]+"";
                li.add(s);
                first=i;
            }


        }
        if(first!=nums.length-1)
            s = nums[first]+"->"+nums[nums.length-1];
        else
            s = nums[first]+"";
        li.add(s);

        return li;


    }

    public static void main(String[] args) {
        Solution s =  new Solution();
        int[] nums= {0,1,2,4,5,7};

        int[] nums1={0,2,3,4,6,8,9};
        System.out.println(s.summaryRanges(nums));

    }
}