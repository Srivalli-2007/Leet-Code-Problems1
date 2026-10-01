class Solution {
    public double myPow(double x, int n) {
        long num = n;
        boolean negative = false;

        if (num < 0) {
            negative = true;
            num = -num;
        }

        double res = 1.0;

        while (num > 0) {
            if (num % 2 != 0) {
                res = res * x;
            }

            x = x * x;
            num = num / 2;
        }

        if (negative) {
            res = 1.0 / res;
        }

        return Math.round(res * 100000.0) / 100000.0;
    }
}
    