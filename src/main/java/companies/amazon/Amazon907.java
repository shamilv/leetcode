package companies.amazon;

import java.util.Stack;

public class Amazon907 {

    // 71, 55,  82, 55
    //-1,  -1,   1  -1
    // 1    4    3   4
    //
    public int sumSubarrayMins2(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int ans = 0;
        int mod = 1_000_000_000 + 7;
        for (int i = 0; i < arr.length; i++) {
            while (stack.size() > 1 && arr[stack.peek()] > arr[i]) {
                int k = stack.pop();
                ans = (ans + (arr[k] * (k - stack.peek()) * (i - k)))%mod;
            }
            stack.push(i);
        }
        int r = arr.length;
        while (stack.size() > 1) {
            int k = stack.pop();
            ans = (ans + (arr[k] * (k - stack.peek()) * (r - k)))%mod;
        }
        return ans;
    }

    // 71, 55,  82, 55
    //-1,  -1,   1  -1
    // 1    4    3   4
    //
    public int sumSubarrayMins(int[] arr) {
        int N = arr.length;
        Stack<Integer> stackL = new Stack<>();
        Stack<Integer> stackR = new Stack<>();
        int[] ple = new int[N];
        int[] nle = new int[N];

        int ans = 0;
        int mod = 1_000_000_000 + 7;
        for (int i = 0; i < N; i++) {
            while (!stackL.isEmpty() && arr[stackL.peek()] >= arr[i]) {
                stackL.pop();
            }
            ple[i] = stackL.isEmpty() ? -1 : stackL.peek();
            stackL.push(i);
        }
        for (int i = N-1; i >= 0; i--) {
            while (!stackR.isEmpty() && arr[stackR.peek()] >= arr[i]) {
                stackR.pop();
            }
            nle[i] = stackR.isEmpty() ? N : stackR.peek();
            stackR.push(i);
        }
        for (int i = 0; i < N; i++) {
            ans = (ans + (arr[i] * (i - ple[i]) * (nle[i] - i)))%mod;
        }
        return ans;
    }
}
