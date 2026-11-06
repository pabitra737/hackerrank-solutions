class Solution {
    public boolean isPowerOfTwo(int n) {
        // if(n < 1) return false;
        // return (n & (n-1)) == 0;

        //bitwise operator
        return n > 0 && (n & (n - 1)) == 0;

        //using loop
        // if(n<1)return false;
        // else if(n==1) return true;
        // else{
        //     while(n%2==0){
        //         n /= 2;
        //     }
        //     if(n==1){
        //         return true;
        //     }
        //     else{
        //         return false;
        //     }
            
        // }
    }
}