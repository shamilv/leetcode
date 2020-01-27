package sorting;

import java.util.Arrays;

public class Solution937 {

    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length <= 1)
            return logs;
        int end = logs.length - 1;
        for (int i = logs.length - 1; i >= 0; i--) {
            char ch = logs[i].charAt(logs[i].length()-1);
            if (Character.isDigit(ch)) {
                String tmp = logs[end];
                logs[end] = logs[i];
                logs[i] = tmp;
                end--;
            }
        }

        Arrays.sort(logs, 0, end + 1, (a, b) -> {
            int pa = a.indexOf(' ');
            int pb = b.indexOf(' ');
            int comp = a.substring(pa + 1).compareTo(b.substring(pb + 1));
            int ans = comp != 0 ? comp : a.substring(0, pa).compareTo(b.substring(0, pb));
            return ans;
        });
        return logs;
    }



}
