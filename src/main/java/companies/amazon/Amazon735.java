package companies.amazon;

import java.util.Stack;

public class Amazon735 {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();
        for (int a: asteroids) {
            int absA = Math.abs(a);
            boolean gonnaCollide = true;
            boolean isSurvived = true;
            while (!stack.isEmpty() && gonnaCollide) {
                int b = stack.peek();
                int absB = Math.abs(b);
                gonnaCollide = a < 0 && b > 0;
                if (gonnaCollide) {
                    if (absA > absB) {
                        stack.pop();
                    } else if (absA <= absB) {
                        if (absA == absB) {
                            stack.pop();
                        }
                        isSurvived = false;
                    }
                    gonnaCollide = absA > absB;
                }
            }
            if (isSurvived) {
                stack.push(a);
            }
        }
        if (stack.isEmpty()) return new int[]{};
        int[] ans = new int[stack.size()];
        int i = ans.length - 1;
        while (!stack.isEmpty()) {
            ans[i--] = stack.pop();
        }
        return ans;
    }
}
