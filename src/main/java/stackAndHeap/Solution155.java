package stackAndHeap;

import java.util.LinkedList;

/**
 * me
 */
public class Solution155 {

    private final LinkedList<Integer> stack;
    private final LinkedList<Integer> minStack;

    /**
     * initialize your data structure here.
     */
    public Solution155() {
        stack = new LinkedList<>();
        minStack = new LinkedList<>();
    }

    public void push(int x) {
        stack.push(x);
        int minVal = minStack.isEmpty() ? x : minStack.peek();
        minStack.push(Math.min(x, minVal));
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minStack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
