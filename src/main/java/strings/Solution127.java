package strings;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution127 {
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
    }
}
