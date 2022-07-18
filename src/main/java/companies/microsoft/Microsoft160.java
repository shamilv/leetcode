package companies.microsoft;

public class Microsoft160 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = getLength(headA);
        int length2 = getLength(headB);
        if (length1 < length2) {
            headB = skipNode(headB, length2 - length1);
        } else if (length2 < length1) {
            headA = skipNode(headA, length1 - length2);
        }
        
        while (headA != null && headB != null) {
            if (headA == headB) {
                return headA;
            }
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
    
    private int getLength(ListNode node) {
        int length = 0;
        while (node != null) {
            length++;
            node = node.next;
        }
        return length;
    }
    
    private ListNode skipNode(ListNode node, int length) {
        while (node != null && length > 0) {
            node = node.next;
            length--;
        }
        return node;
    }
}
