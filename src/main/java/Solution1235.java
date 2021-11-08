import java.util.Arrays;
import java.util.Comparator;

public class Solution1235 {

    private static class Task {
        int start;
        int end;
        int profit;

        public Task(int start, int end, int profit) {
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        if (startTime.length == 1) {
            return profit[0];
        }
        int N = startTime.length;
        int[] memo = new int[N];
        Task[] tasks = new Task[N];
        for (int i = 0; i < startTime.length; i++) {
            tasks[i] = new Task(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(tasks, Comparator.comparingInt(a -> a.start));
        int ans = 0;
        for (int i = 0; i < N; i++) {
            ans = Math.max(ans, calc(tasks, memo, i));
        }
        return ans;
    }

    private int calc(Task[] tasks, int[] memo, int i) {
        int total = tasks[i].profit;
        int curCost = tasks[i].profit; int connCost = 0;
        for (int j = i + 1; j < tasks.length; j++) {
            if (tasks[j].start < tasks[i].end) continue;
            connCost = memo[j] != 0 ? memo[j] : Math.max(connCost, calc(tasks, memo, j));
            total = Math.max(total, curCost + connCost);
        }
        memo[i] = total;
        return total;
    }
}
