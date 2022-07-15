package amazon;

import java.util.*;

public class Amazon1481 {
    public int findLeastNumOfUniqueInts_BruteForce(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: arr) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }

        PriorityQueue<Integer> q = new PriorityQueue<>();
        for (int freq: map.values()) {
            q.add(freq);
        }
        while (!q.isEmpty() && k-- > 0) {
            int u = q.poll();
            if (--u > 0) {
                q.add(u);
            }
        }
        return q.size();
    }

    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int n: arr) {
            map.putIfAbsent(n, 0);
            map.put(n, map.get(n) + 1);
        }

        TreeMap<Integer, Integer> q = new TreeMap<>();
        for (int freq: map.values()) {
            q.putIfAbsent(freq, 0);
            q.put(freq, q.get(freq) + freq);
        }
        while (!q.isEmpty() && k-- > 0) {
            int u = q.firstKey();
            int cnt = q.get(u);
            cnt--;
            if (cnt > 0) {
                q.put(u, cnt);
            } else {
                q.remove(u);
            }
        }
        return q.size();
    }
}
