import java.util.HashMap;
import java.util.Stack;

public class prac {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map  = new HashMap<>();
        int [] re = new int[2];
        for (int i =0;i<nums.length;i++) {

            if(map.containsKey(target-nums[i])){
                re[0] = map.get(target-nums[i]);
                re[1] =i;
                break;
            }
            else{
                map.put(nums[i],i);
            }

        }
        return re;
    }

    public boolean isValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Character> st= new Stack<>();
        for(char c : arr ){
            if (c =='{'||c=='[' ||c=='('){
                st.push(c);
            }
            else if((c=='}' && (st.empty()||st.peek()!='{')) ||
                    (c==']' && (st.empty()||st.peek()!='[')) ||
                    (c==')' && (st.empty()||st.peek()!='(')))
            {

                    return false;
            }
            else
                st.pop();


        }

        return st.empty();
    }

    public static void main(String[] args) {
        prac p = new prac();
        int [] nums = {2, 7, 11, 15};
        int target = 9;
        int [] sol = p.twoSum(nums,target);
        System.out.println(p.isValid("]"));

    }
}
