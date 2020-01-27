package arrays;

public class Solution1300 {

    public int findBestValue(int[] arr, int k) {
        int left = 1, right = arr[0], ans = 0;
        for (int a: arr)
            right = a > right ? a : right;

        while (left <= right) {
            int mid = left + (right - left)/2;
            int sum = 0;
            for (int a: arr)
                sum += mid < a ? mid : a;
            if (sum <= k) {
                ans = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        int ans2 = ans + 1;
        int sum = 0, sum2 = 0;
        for (int a: arr) {
            sum += ans < a ? ans : a;
            sum2 += ans2 < a ? ans2 : a;
        }

        return Math.abs(k - sum) <= Math.abs(k - sum2) ? ans : ans2;
    }


    public int findBestValue3(int[] arr, int target) {
        int r = 1, l = 1;
        for (int a: arr)
            r = Math.max(r, a);
        while (l < r) {
            int mid = l + (r - l)/2;
            int k = 0;
            for (int a: arr) k += a > mid ? mid : a;
            if (k >= target)
                r = mid;
            else if (k < target) {
                l = mid + 1;
            }
        }
        int ans2 = l - 1, k1 = 0, k2 = 0;
        for (int a: arr) {
            k1 += a > l ? l : a;
            k2 += a > ans2 ? ans2 : a;
        }
        return Math.abs(target - k2) <= Math.abs(target - k1) ? ans2 : l;
    }


    public int findBestValue2(int[] arr, int target) {
        int l, r, mi, s=0, m=-1;
        for(int v:arr) { s += v; m=Math.max(m,v); }

        if(s<=target) return m; // return the max value since we will keep all nums as is

        for(l=1,r=m;l<r;) {
            mi=(l+r)/2;
            s=0;
            for(int v:arr) s += (v>mi)?mi:v;
            if(s>=target) r=mi;
            else          l=mi+1;
        }
        // check if we are 1 step off the target
        int s1=0,s2=0;
        for(int v:arr) {
            s1 += (v>l)?(l):v;
            s2 += (v>l-1)?(l-1):v;
        }

        //return (Math.abs(s2-target) <= Math.abs(s1-target)) ? l-1 : l;
        return l;
    }
}
