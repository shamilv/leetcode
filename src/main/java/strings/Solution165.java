package strings;

public class Solution165 {

    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int n = Math.max(v1.length, v2.length);
        for (int i = 0; i < n; i++) {
            Integer level1 = i >= v1.length ? 0 : Integer.valueOf(v1[i]);
            Integer level2 = i >= v2.length ? 0 : Integer.valueOf(v2[i]);
            int res = level1.compareTo(level2);
            if (res != 0)
                return res;
        }
        return 0;
    }
}
