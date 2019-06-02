package strings;

import java.util.*;

public class Solution127 {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        int len = beginWord.length();
        Map<String, List<String>> dict = new HashMap<>();
        wordList.forEach(word -> {
            for (int i = 0; i < len; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, len);
                dict.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);
            }
        });

        LinkedList<Object[]> queue = new LinkedList<>();
        queue.add(new Object[]{beginWord, 1});
        Set<String> visited = new HashSet<>();
        visited.add(beginWord);
        while(!queue.isEmpty()) {
            Object[] pair = queue.remove();
            String word = (String) pair[0];
            Integer level = (Integer) pair[1];
            for (int i = 0; i < len; i++) {
                String newWord = word.substring(0, i) + "*" + word.substring(i + 1, len);
                for (String searchWord: dict.getOrDefault(newWord, new ArrayList<>())) {
                    if (searchWord.equals(endWord))
                        return level + 1;
                    if (!visited.contains(searchWord)) {
                        visited.add(searchWord);
                        queue.offer(new Object[]{searchWord, level + 1});
                    }
                }
            }
        }

        return 0;
    }

    /**
     * It was slow solution
     *
      public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> dict = new HashSet<>(wordList);
        if (!dict.contains(endWord))
            return 0;
        return ladderLength(beginWord, endWord, dict, new HashSet<>());
    }

    private int ladderLength(String beginWord, String endWord, Set<String> dict, HashSet<String> path) {
        if (beginWord.equals(endWord))
            return path.size() + 1;
        int res = 0;
        for (String w: dict) {
            if (path.contains(w))
                continue;
            if (isTransformable(beginWord, w)) {
                path.add(w);
                int len = ladderLength(w, endWord, dict, path);
                res = len != 0 ? (res != 0 ? Math.min(len, res) : len) : res;
                path.remove(w);
            }
        }
        return res;
    }

    private boolean isTransformable(String beginWord, String endWord) {
        int cnt = 0;
        for (int i = 0; i < beginWord.length(); i++)
            if (beginWord.charAt(i) != endWord.charAt(i))
                cnt++;
        return cnt <= 1;
    }*/
}
