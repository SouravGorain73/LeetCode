public class Solution{
    public int repeatedStringMatch(String a, String b) {
        int len = b.length()/a.length();
        String res = a;
        if(b.length() <= a.length()){
            len++;
        }
        int i = 1;
        while(i <= len + 2){
            if(res.contains(b)){
                return i;
            }
            res = res + a;
            i++;
        }
        return -1;
    }
}