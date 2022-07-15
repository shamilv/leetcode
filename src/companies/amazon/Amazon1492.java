package amazon;

import java.util.*;

public class Amazon1492 {

    public int kthFactor(int n, int k) {
        List<Integer> divisors = new  ArrayList<>();
        int sqrtN = (int)Math.sqrt(n);
        for (int i = 1; i <= sqrtN; i++) {
            if (n % i == 0) {
                k--;
                divisors.add(i);
                if (k == 0) {
                    return i;
                }
            }
        }
        if (sqrtN * sqrtN == n) {
            k++;
        }
        int nDiv = divisors.size();
        return (k <= nDiv) ? n / divisors.get(nDiv - k) : -1;
    }

    public int kthFactor2(int n, int k) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        int p = (int)Math.sqrt(n);
        for (int i = 1; i <= p; i++) {
            if (n % i == 0) {
                addToQueue(i, q, k);
                if (i != n / i) {
                    addToQueue(n / i, q, k);
                }
            }
        }
        return q.size() < k ? -1 : q.poll();
    }

    private void addToQueue(int a, Queue<Integer> q, int k) {
        q.add(a);
        if (q.size() > k) {
            q.poll();
        }
    }

    public int kthFactor1_BruteForce(int n, int k) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
            }
        }
        for (int ans: set) {
            k--;
            if (k == 0) {
                return ans;
            }
        }
        return -1;
    }

}
