package _repeatHere;

import java.util.ArrayList;
import java.util.List;

public class MinHeap {
    private List<Integer> A = new ArrayList<>();
    
    //6, 10, 7
    public void add(int val) {
        A.add(val);
        int curIndex = A.size() - 1;
        int pIndex = ((curIndex + 1) / 2) - 1;
        while (pIndex >= 0 && A.get(pIndex) > val) {
            int tmp = A.get(pIndex);
            A.set(pIndex, val);
            A.set(curIndex, tmp);
            curIndex = pIndex;
            pIndex = ((curIndex + 1) / 2) - 1;
        }
    }

    public int pop() {
        if (A.size() == 0) throw new NullPointerException();
        int a = A.get(0);
        A.set(0, A.get(A.size() - 1));
        A.remove(A.size() - 1);
        int current = 0, left = 1, right = 2;
        
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            if (left < A.size() && right < A.size()) {
                if (A.get(left) < A.get(right) && A.get(left) < A.get(current)) {
                    swap(left, current);
                    current = left;
                    swapped = true;
                } else if (A.get(right) < A.get(left) && A.get(right) < A.get(current)) {
                    swap(right, current);
                    current = right;
                    swapped = true;
                }
            } else if (left < A.size() && A.get(left) < A.get(current)) {
                swap(left, current);
                current = left;
                swapped = true;
            } else if (right < A.size() && A.get(right) < A.get(current)) {
                swap(right, current);
                current = right;
                swapped = true;
            }
            left = 2*current + 1;
            right = 2*current + 2;
        }
        return a;
    }

    private void swap(int i, int j) {
        int tmp = A.get(i);
        A.set(i, A.get(j));
        A.set(j, tmp);
    }

    public Integer peek() {
        if (A.size() == 0) return null;
        return A.get(0);
    }
}
