import java.util.Arrays;
import java.util.PriorityQueue;

public class Solution1684 {

    public int maxProfit(int[] inventory, int orders) {
        Arrays.sort(inventory);
        int ans = 0;
        int index = inventory.length - 1;
        while (orders > 0 && index >= 0) {
            ans = (ans + inventory[index]) % 1000000007;
            --inventory[index];
            if (index >= 1 && inventory[index] < inventory[index - 1]) {
                index--;
            } else {
                index = inventory.length - 1;
            }
            orders--;
        }
        return ans;
    }

    public int maxProfit2(int[] inventory, int orders) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a, b) -> b - a);
        for (int a: inventory) {
            q.add(a);
        }
        int ans = 0;
        while (orders > 0 && !q.isEmpty()) {
            int t = q.poll();
            ans = (ans + t) % 1000000007;
            if (--t > 0) {
                q.add(t);
            }
            orders--;
        }
        return ans;
    }
}
