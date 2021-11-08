import java.util.Deque;
import java.util.LinkedList;

/*
Algorithm:
Time complexity:
Space complexity:
Comments:
Solution: mine
 */

public class Solution224 {

    private int pos = 0;

    private class Node {
        String val;
        Node left;
        Node right;
        Node(char ch) {
            val = String.valueOf(ch);
        }
    }

    public int calculate(String s) {
        Node node = buildTree(s);
        return calc(node);
    }

    private Node buildTree(String s) {
        Node curNode = null;
        while (pos < s.length()) {
            char ch = s.charAt(pos);
            if (Character.isDigit(ch)) {
                if (curNode == null) {
                    curNode = new Node(ch);
                } else if (curNode.val.equals("+") || curNode.val.equals("-")) {
                    if (curNode.right == null) {
                        curNode.right = new Node(ch);
                    } else {
                        curNode.right.val += ch;
                    }
                } else {
                    curNode.val += ch;
                }
            } else if (ch == '+' || ch == '-') {
                Node sign = new Node(ch);
                sign.left = curNode;
                curNode = sign;
            } else if (ch == '(') {
                pos++;
                Node n = buildTree(s);
                if (curNode == null) {
                    curNode = n;
                } else {
                    curNode.right = n;
                }
            } else if (ch == ')') {
                return curNode;
            }
            pos++;
        }
        return curNode;
    }

    private int calc(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.val.equals("+") || root.val.equals("-")) {
            int left = calc(root.left);
            int right = calc(root.right);
            return root.val.equals("+") ? left + right : left - right;
        } else {
            return Integer.valueOf(root.val);
        }
    }
}
