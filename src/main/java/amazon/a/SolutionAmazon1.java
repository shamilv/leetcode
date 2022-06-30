package amazon.a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SolutionAmazon1 {
    private int rate = 2;
    private List<Integer> list = Arrays.asList(5, 3);
    private List<Integer> ans = Collections.emptyList();
    private int minCnt = Integer.MAX_VALUE;

    public List<Integer> exchange(int usd) {
        int euro = usd/rate;
        findMoney(euro, 0, 0, new ArrayList<>());
        return ans;
    }
    
    private void findMoney(int rest, int i, int cnt, List<Integer> tokens) {
        if (rest == 0) {
            if (cnt < minCnt) {
                ans = new ArrayList<>();
                ans.addAll(tokens);
            }
            return;
        } else if (rest < 0) {
            return;
        }

        for (int k = i; k < list.size(); k++) {
            tokens.add(list.get(k));
            findMoney(rest - list.get(k), i, cnt + 1, tokens);
            tokens.remove(tokens.size()-1);
        }
    }
}
