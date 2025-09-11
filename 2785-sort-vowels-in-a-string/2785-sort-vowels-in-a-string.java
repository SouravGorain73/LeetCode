class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder(s);
        int n = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                n++;
            }
        }
        char[] str = new char[n];
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                str[index] = ch;
                index++;
            }
        }
        Arrays.sort(str);
        int in = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                sb.setCharAt(i, str[in]);
                in++;
            }
        }
        return sb.toString();
    }
}