package arrays;

import java.util.ArrayList;
import java.util.List;

public class Solution611 {

    public int triangleNumber(int[] nums) {
        if (nums == null || nums.length == 0)
            return 0;
        return triangleNumber(nums, 0, new ArrayList<>());
    }

    private int triangleNumber(int[] nums, int pos, List<Integer> buf) {
        if (buf.size() == 3) {
            if (buf.get(0) < buf.get(1) + buf.get(2) &&
                buf.get(1) < buf.get(0) + buf.get(2) &&
                buf.get(2) < buf.get(0) + buf.get(1))
                return 1;
            return 0;
        }

        int res = 0;
        for (int i = pos; i < nums.length - (2 - buf.size()); i++) {
            buf.add(nums[i]);
            res += triangleNumber(nums, i + 1, buf);
            buf.remove(buf.size() - 1);
        }
        return res;
    }

}
