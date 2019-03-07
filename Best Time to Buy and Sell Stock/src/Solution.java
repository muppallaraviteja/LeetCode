import java.util.ArrayList;

public class Solution {
    public int maxProfit(int[] prices) {
        ArrayList<Integer> arr  = new ArrayList<>();
        arr.add(1);
        arr.add(3);
        for(Integer k : arr){
            System.out.println(k);
        }
        int min=Integer.MAX_VALUE;
        int max=0;
        for (int i=0;i<prices.length;i++) {
            if (min > prices[i])
                min = prices[i];
            if (max < prices[i]-min)
                max=prices[i]-min;
        }

        return max;
    }
}
