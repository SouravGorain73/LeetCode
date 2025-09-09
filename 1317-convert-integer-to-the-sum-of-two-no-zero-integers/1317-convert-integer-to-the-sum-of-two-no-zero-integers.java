class Solution {
    public int[] getNoZeroIntegers(int n) {
        int num1 = 1;
        int num2 = n - num1;
        for(int i = 0; i < n; i++){
            boolean ans = true;
            num2 = n - num1;
            int n1 = num1;
            int n2 = num2;
            while(n1 > 0){
                int rem1 = n1 % 10;
                if(rem1 == 0){
                    ans = false;
                }
                n1 /= 10;
            }
            while(n2 > 0){
                int rem2 = n2 % 10;
                if(rem2 == 0){
                    ans = false;
                }
                n2 /= 10;
            }
            if(ans == false){
                num1++;
                continue;
            }
        }
        int arr[] = new int[2];
        arr[0] = num1;
        arr[1] = num2;
        return arr;
    }
}