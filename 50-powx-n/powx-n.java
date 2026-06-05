class Solution {
    public double myPow(double x, int n) {
        
        long N = n;  // int కాదు, long వాడు! ⬅️
        
        if (N == 0) return 1;
        
        if (N < 0) {
            x = 1 / x;
            N = -N;  // ఇప్పుడు overflow కాదు ✅
        }
        
        return helper(x, N);
    }
    
    private double helper(double x, long N) {
        if (N == 0) return 1;
        
        double half = helper(x, N / 2);
        
        if (N % 2 == 0) {
            return half * half;
        } else {
            return half * half * x;
        }
    }
}