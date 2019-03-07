import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permarray = new ArrayList<>();
        for (int i =0;i<nums.length;i++) {
            permarray.addAll(rotate(nums,i));

        }
        return permarray;
    }

    public List<List<Integer>> rotate(int[] num,int hold) {
        List<List<Integer>> permarray = new ArrayList<>();
        int num_of_rotations = 0;
        int temp = num[hold];
        num[hold]=num[0];
        num[0]=temp;
        while (num_of_rotations < num.length - 1) {
            temp=num[1];
            for (int i = 1; i < num.length - 1; i++) {
                num[i] = num[i + 1];
            }
            num[num.length - 1] = temp;
            permarray.add(IntStream.of(num).boxed().collect(Collectors.toList()));
            ++num_of_rotations;
        }
        if(num.length==1)
            permarray.add(IntStream.of(num).boxed().collect(Collectors.toList()));
        return permarray;
    }


    public static void main(String[] args) {
        Solution s = new Solution();
        int[] nums ={5,4,6,2};
        List<List<Integer>> x = s.permute(nums);
        System.out.println(x);
    }
}