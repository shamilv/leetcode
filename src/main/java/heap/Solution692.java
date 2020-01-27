package heap;

import java.util.*;

public class Solution692 {

    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> d = new HashMap<>();
        for (String w: words)
            d.put(w, d.getOrDefault(w, 0) + 1);
        PriorityQueue<Map.Entry<String, Integer>> q = new PriorityQueue<>((a, b) ->
                a.getValue() == b.getValue() ? b.getKey().compareTo(a.getKey()) : a.getValue() - b.getValue());
        for (Map.Entry<String, Integer> entry: d.entrySet()) {
            q.add(entry);
            if (q.size() > k)
                q.poll();
        }
        List<String> ans = new LinkedList<>();
        while (k-- > 0)
            ans.add(0, q.poll().getKey());
        return ans;
    }
}
