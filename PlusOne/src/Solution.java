public class Solution {
    public int[] plusOne(int[] digits) {
        int carry=0;
        Integer.MIN_VALUE
        for(int j=digits.length-1;j>=0;j--){
            if(j==digits.length-1){
                digits[j]+=1;
                if(digits[j]==10){
                    digits[j]=0;
                    carry=1;
                }
            }
            else if(digits[j]==9 && carry==1){
                digits[j]=0;
                carry=1;
            }
            else if(carry==1){
                carry=0;
                digits[j]+=1;
            }

        }
        if(carry==1){
            int[] answer = new int[digits.length+1];
            answer[0]=1;
            return answer;
        }

        return digits;
    }

}
