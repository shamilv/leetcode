package companies.amazon;

import java.util.PriorityQueue;

public class Amazon295 {

    private PriorityQueue<Integer> lo = new PriorityQueue<>((a, b) -> b - a);
    private PriorityQueue<Integer> hi = new PriorityQueue<>();

    //1, 2
    //1,
    //2
    public void addNum(int num) {
        lo.add(num);
        hi.add(lo.poll());
        if (lo.size() < hi.size()) {
            lo.add(hi.poll());
        }
    }

    public double findMedian() {
        if (lo.size() == hi.size()) {
            return (lo.peek() + hi.peek()) * 0.5d;
        }
        return lo.peek();
    }
}
