class Solution {
    public int[] divisibilityArray(String word, int m) {
        char[] ch = word.toCharArray();
        int[] ans = new int[ch.length];
        long val = 0;
        for(int i = 0; i < ch.length; i++){
            int n = ch[i] - 48;
            val = (val * 10 + n) % m;
            if(val == 0){
                ans[i] = 1;
            }
            else{
                ans[i] = 0;
            }
        }
        return ans;
    }
}