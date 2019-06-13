import java.util.HashSet;
import java.util.Set;

class Solution {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for(String email: emails){

            email  = email.replace(".","");
            int i1 = email.indexOf("+");
            int i2 = email.indexOf("@");

            email = email.replaceAll(email.substring(i1-i2-1),"");
            set.add(email);
        }

        return set.size();


    }
}
