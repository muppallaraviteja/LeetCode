class Solution {
    public String addStrings(String num1, String num2) {
        int i=num1.length()-1;int j=num2.length()-1;
        int carry=0;
        int sum ;


        StringBuilder sb = new StringBuilder();
        while(i>=0 && j>=0)
        {
            int n1 = num1.charAt(i)-'0';

            int n2 = num2.charAt(j)-'0';
            sum =n1+n2+carry;

            sb.append(sum%10);
            carry = sum/10;
            i--;
            j--;

        }
        System.out.println(sb.toString());
        String temp = "";
        while(i>-1) {
            // System.out.println(i);
            int n1 = num1.charAt(i)-'0';
            sum = n1+carry;
            sb.append(sum%10);
            carry = sum/10;
            i--;
        }
        while(j>-1) {

            int n1 = num2.charAt(j)-'0';
            sum = n1+carry;
            sb.append(sum%10);
            carry = sum/10;
            j--;
        }

        if(carry==1)
            sb.append(carry);

        temp+=sb.reverse().toString();
        return temp;
    }


    public static void main(String[] args) {
        Solution s  = new Solution();
        System.out.println(s.addStrings("999","9999"));




    }
}
