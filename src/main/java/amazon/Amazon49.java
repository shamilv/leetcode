package amazon;

import java.util.*;

/**
 * Time complexity: N*KLogK where N is the length of the input list and K is the length of word. And we sort every word in the list which gives us
 * KLogK.
 *
 * Space complexity: O(NK), where N is the number of words and K is the number of keys.
 */

public class Amazon49 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> dict = new HashMap<>();
        for (String a: strs) {
            char[] A = a.toCharArray();
            Arrays.sort(A);
            String key = new String(A);

            if (!dict.containsKey(key)) {
                dict.put(key, new LinkedList<>());
            }
            List<String> group = dict.get(key);
            group.add(a);
        }

        List<List<String>> ans = new LinkedList<>();
        for (String key: dict.keySet()) {
            ans.add(dict.get(key));
        }
        return ans;
    }

}
