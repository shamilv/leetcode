package stackAndHeap;

import java.util.*;

/**
 * not me
 */

public class Solution232 {

    private final Deque<Integer> input;
    private final Deque<Integer> output;

    /** Initialize your data structure here. */
    public Solution232() {
        input = new ArrayDeque<>();
        output = new ArrayDeque<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        input.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        peek();
        return output.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (output.isEmpty())
            while (!input.isEmpty())
                output.push(input.pop());
        return output.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

}
