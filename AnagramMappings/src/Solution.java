import java.util.HashMap;

public class Solution {
    public int[] anagramMappings(int[] A, int[] B) {
        int[] mapper = new int[A.length];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<A.length;i++){
            map.put(A[i],i);
        }
        for(int i =0;i<A.length;i++){
            int k = map.get(B[i]);
            mapper[i] = k;
        }
        return mapper;

    }

    public static void main(String[] args) {
    }
}
