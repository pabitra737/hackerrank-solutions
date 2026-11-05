class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        int temp = x;
        int sum = 0;
        while(temp>0){
            int d = temp % 10;
            sum = sum * 10 + d;
            temp /= 10;
        }
        if(sum == x){
            return true;
        }
        else{
            return false;
        }
        //return sum == x;

        // String s = String.valueOf(x); // Convert to String
        // int n = s.length(); // Store the String length to int n

        // for (int i=0; i<n/2; i++) {
        //     // We check whether the elements at the same distance from
        //     // beginning and from ending are same, if not we return false
        //     if (s.charAt(i) != s.charAt(n-i-1)) return false;
        // }

        // // if no flaws are found we return true
        // return true;
    }
}