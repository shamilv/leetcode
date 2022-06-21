package amazon;

import java.util.Arrays;

public class Amazon937 {

    public String[] reorderLogFiles(String[] logs) {
        Arrays.sort(logs, (a, b) -> compare(a, b));
        return logs;
    }

    //"a1 3 2", "a2 a a"
    //"a1 3 2", "a1 1 2"
    //"a1 a", "a1 b"
    //"a1 a", "a1 a"
    //"a1 a", "a2 a"
    private int compare(String a, String b) {
        char chA = a.charAt(a.length() - 1);
        char chB = b.charAt(b.length() - 1);
        if (Character.isDigit(chA) && Character.isDigit(chB)) {
            return 0;
        } else if (!Character.isDigit(chA) && Character.isDigit(chB)) {
            return -1;
        } else if (Character.isDigit(chA) && !Character.isDigit(chB)) {
            return 1;
        } else {
            int posA = a.indexOf(" ");
            int posB = b.indexOf(" ");
            String dataA = a.substring(posA + 1);
            String dataB = b.substring(posB + 1);
            int comp = dataA.compareTo(dataB);
            if (comp != 0) return comp;

            String indexA = a.substring(0, posA);
            String indexB = b.substring(0, posB);
            return indexA.compareTo(indexB);
        }
    }
}
