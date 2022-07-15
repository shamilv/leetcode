package companies.amazon;

import java.util.*;

public class Amazon1152 {
    private static class Node {
        private int timestamp;
        private String website;
        public Node(int timestamp, String website) {
            this.timestamp = timestamp;
            this.website = website;
        }
    }

    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        int N = username.length;
        Map<String, List<Node>> nodes = new HashMap<>();
        for (int i = 0; i < N; i++) {
            nodes.putIfAbsent(username[i], new ArrayList<>());
            nodes.get(username[i]).add(new Node(timestamp[i], website[i]));
        }

        String ans = "";
        Map<String, Integer> counter = new HashMap<>();
        for (String key: nodes.keySet()) {
            HashSet<String> dict = new HashSet<>();
            List<Node> userList = nodes.get(key);
            Collections.sort(userList, (a, b) -> a.timestamp - b.timestamp);
            int M = userList.size();
            for (int i = 0; i < M; i++) {
                for (int j = i + 1; j < M; j++) {
                    for (int k = j + 1; k < M; k++) {
                        String pattern = userList.get(i).website + "#" + userList.get(j).website + "#" + userList.get(k).website;
                        if (!dict.contains(pattern)) {
                            dict.add(pattern);
                            counter.put(pattern, counter.getOrDefault(pattern, 0) + 1);
                        }
                        if (ans.equals("") || (counter.get(ans) < counter.get(pattern)) || (counter.get(ans) == counter.get(pattern) && pattern.compareTo(ans) < 0)) {
                            ans = pattern;
                        }
                    }
                }
            }
        }
        return Arrays.asList(ans.split("#"));
    }
}
