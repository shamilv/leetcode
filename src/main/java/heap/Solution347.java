package heap;

import java.util.*;

public class Solution347 {

    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int n: nums)
            d.put(n, d.getOrDefault(n, 0) + 1);
        LinkedList[] f = new LinkedList[nums.length + 1];
        for (int p: d.keySet()) {
            int freq = d.get(p);
            if (f[freq] == null)
                f[freq] = new LinkedList<>();
            f[freq].add(p);
        }
        List<Integer> ans = new LinkedList<>();
        for (int i = f.length - 1; i >= 0 && ans.size() < k; i--) {
            if (f[i] != null) {
                ans.addAll(f[i]);
            }
        }

        return ans;
    }

    public List<Integer> topKFrequent2(int[] nums, int k) {
        Map<Integer, Integer> d = new HashMap<>();
        for (int n: nums)
            d.put(n, d.getOrDefault(n, 0) + 1);
        PriorityQueue<int[]> q = new PriorityQueue<>((a1, a2) -> a2[1] - a1[1]);
        for (int p: d.keySet())
            q.offer(new int[]{p, d.get(p)});
        List<Integer> ans = new LinkedList<>();
        while (k-- > 0)
            ans.add(q.poll()[0]);

        return ans;
    }
}
