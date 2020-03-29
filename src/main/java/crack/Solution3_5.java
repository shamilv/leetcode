package crack;

import java.util.Stack;

public class Solution3_5 {

    //T.C.: O(N^2)
    //s.C.: O(N)
    public Stack<Integer> sortStack(Stack<Integer> stack) {
        Stack<Integer> sorted = new Stack<>();
        while (!stack.isEmpty()) {
            Integer cur = stack.pop();
            while (!sorted.isEmpty() && cur > sorted.peek())
                stack.push(sorted.pop());
            sorted.push(cur);
        }
        return sorted;
    }

}
