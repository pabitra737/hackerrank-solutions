class Solution {
    public int tribonacci(int n) {
        if(n<=1) return n;
        int a=0, b=1, c=1;
        for(int i = 1; i<=n; i++){
            int temp = a+b+c;
            a=b;
            b=c;
            c=temp;
        }
        return a;
    }
}