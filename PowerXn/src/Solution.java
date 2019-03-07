
//Wrong Solution
class Solution {
    public double fastPow(double x, long n){
        return n%2==0 ? fastPow(x*x, n/2) : x*fastPow(x*x, n/2);
    }
    public double myPow(double x, int n) {
        long k =n;
        if(n==0) return 1;
        if(n<0){
            k -= 2*n;
            x = 1/x;
        }
        return fastPow(x,k);
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.myPow(2.00000
                ,-2147483648));
    }
}