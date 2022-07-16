package companies.microsoft;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Microsoft49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        Map<String, List<String>> dict = new HashMap<>();
        for (String str: strs) {
            char[] keyArray = str.toCharArray();
            Arrays.sort(keyArray);
            String key = new String(keyArray);
            dict.putIfAbsent(key, new ArrayList<>());
            dict.get(key).add(str);
        }
        for (String key: dict.keySet()) {
            ans.add(dict.get(key));
        }
        
        return ans;
    }
}
