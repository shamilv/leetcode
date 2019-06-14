package linkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution234Test {

    @Test
    public void cornerCase() {
        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(null);

        assertTrue(res);
    }

    @Test
    public void baseCase() {
        Solution234.ListNode head = new Solution234.ListNode(1);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertTrue(res);
    }

    @Test
    public void baseCase2() {
        Solution234.ListNode head = new Solution234.ListNode(1);
        head.next = new Solution234.ListNode(1);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertTrue(res);
    }

    @Test
    public void baseCase3() {
        Solution234.ListNode head = new Solution234.ListNode(1);
        head.next = new Solution234.ListNode(2);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertFalse(res);
    }

    @Test
    public void regularCaseEvenNumber() {
        Solution234.ListNode head = new Solution234.ListNode(1);
        head.next = new Solution234.ListNode(2);
        head.next.next = new Solution234.ListNode(2);
        head.next.next.next = new Solution234.ListNode(1);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertTrue(res);
    }

    @Test
    public void regularCaseOddNumber() {
        Solution234.ListNode head = new Solution234.ListNode(1);
        head.next = new Solution234.ListNode(2);
        head.next.next = new Solution234.ListNode(3);
        head.next.next.next = new Solution234.ListNode(2);
        head.next.next.next.next = new Solution234.ListNode(1);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertTrue(res);
    }

    @Test
    public void regularCaseOddNumberFalse() {
        Solution234.ListNode head = new Solution234.ListNode(1);
        head.next = new Solution234.ListNode(2);
        head.next.next = new Solution234.ListNode(3);
        head.next.next.next = new Solution234.ListNode(1);
        head.next.next.next.next = new Solution234.ListNode(1);

        Solution234 solution234 = new Solution234();
        boolean res = solution234.isPalindrome(head);

        assertFalse(res);
    }

}