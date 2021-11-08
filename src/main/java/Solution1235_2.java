import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class Solution1235_2 {

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
        test(5);
        if (startTime.length == 1) {
            return profit[0];
        }
        int N = startTime.length;
        Task[] tasks = new Task[N];
        for (int i = 0; i < startTime.length; i++) {
            tasks[i] = new Task(startTime[i], endTime[i], profit[i]);
        }
        Arrays.sort(tasks, Comparator.comparingInt(a -> a.end));
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (Task task: tasks) {
            int cur = dp.floorEntry(task.start).getValue() + task.profit;
            if (cur > dp.lastEntry().getValue()) {
                dp.put(task.end, cur);
            }
        }
        return dp.lastEntry().getValue();
    }

    public void test(int n) {
        if (n > 0) {
            for (int i = 0; i < n; i++) {
                System.out.println(String.format("%d", n));
            }
            test(n - 1);
        }
    }
}
