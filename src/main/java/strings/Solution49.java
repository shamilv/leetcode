package strings;

import java.util.*;
import java.util.stream.Collectors;

public class Solution49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        for (String word: strs) {
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String newWord = new String(chars);
            dict.computeIfAbsent(newWord, k -> new ArrayList<>()).add(word);
        }
        return dict.values().stream().collect(Collectors.toList());
    }

    /**
     *

    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        if (strs == null || strs.length == 0)
            return res;

        Map<String, Integer> dict = new HashMap<>();
        for (String w: strs) {
            char[] chs = w.toCharArray();
            Arrays.sort(chs);
            String sorted = String.valueOf(chs);
            if (!dict.containsKey(sorted)) {
                List<String> list = new ArrayList<>();
                list.add(w);
                res.add(list);
                dict.put(sorted, res.size() - 1);
            } else {
                res.get(dict.get(sorted)).add(w);
            }
        }

        return res;
    }
     */
}
