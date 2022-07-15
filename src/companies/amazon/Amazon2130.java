package amazon;

public class Amazon2130 {
    private static class ListNode {
        int val;
        ListNode next;
    }

    private int[] M = new int[100000];

    // 1 2 3 4
    public int pairSum(ListNode head) {
        int N = 0;
        ListNode current = head;
        while (current != null) {
            M[N++] = current.val;
            current = current.next;
        }

        int ans = 0;
        for (int i = 0, j = N - 1; i < j; i++, j--) {
            ans = Math.max(ans, M[i] + M[j]);
        }
        return ans;
    }

    // 1 2 3 4
    // 1 2 3 4 5 6
    /*private ListNode findTwin(ListNode s, ListNode f) {
        if (f.next == null) {
            return s.next;
        }
        s = s.next;
        f = f.next.next;
        ListNode p = findTwin(s, f);
        ans = Math.max(ans, s.val + p.val);
        return p.next;
    }*/
}
