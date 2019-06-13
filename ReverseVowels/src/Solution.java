class Solution {
    public String reverseVowels(String s) {
        StringBuffer x = new StringBuffer();
        StringBuffer x1 = new StringBuffer();
        String [] arr = s.split("");

        for(String ch : arr){
            if( ch.equalsIgnoreCase("a") ||  ch.equalsIgnoreCase("e")|| ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))
                x.append(ch);
        }
        x = x.reverse();
        int i=0;
        for(String ch : arr){
            if(ch.equalsIgnoreCase("a") ||  ch.equalsIgnoreCase("e")|| ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u"))
            {
                x1.append(x.charAt(i));
                i++;

            }
            else
                x1.append(ch);
        }
        return x1.toString();

    }
}
