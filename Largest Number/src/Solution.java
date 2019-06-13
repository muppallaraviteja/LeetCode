import java.util.Arrays;
import java.util.Comparator;

public class Solution {


    public String largestNumber(int[] nums) {
        String [] num = new String[nums.length];
        for(int i =0;i<nums.length;i++){
            num[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(num, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                String c1 = o1+o2;
                String c2 = o2+o1;
                return c2.compareTo(c1);

            }
        });
        if(num[0].equals("0"))
            return "0";
        String x = "";
        for(int i =0;i<num.length;i++){

            System.out.println(num[i]);
        }

        return x;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int [] nums = {10,2,9,5};
        s.largestNumber(nums);

    }

}
