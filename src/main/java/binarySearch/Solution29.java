package binarySearch;

public class Solution29 {

    public int divide(int dividend, int divisor) {
        int l = 0, h = Integer.MAX_VALUE;
        boolean pos = true;
        if ((dividend < 0 && divisor > 0) || (dividend > 0 && divisor < 0))
            pos = false;

        dividend = dividend == Integer.MIN_VALUE ? Integer.MAX_VALUE : Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (l <= h) {
            int mid = l + (h - l)/2;
            long val = 0, i = 0;
            while (i++ < divisor)
                val += mid;

            if (val == dividend)
                return pos ? mid : mid * -1;
            else if (val > dividend)
                h = mid - 1;
            else
                l = mid + 1;
        }
        return pos ? h : h * -1;
    }

}
