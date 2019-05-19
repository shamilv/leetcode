package arrays;

import java.util.*;

public class Solution380 {

    private final Map<Integer, Integer> map = new HashMap<>();
    private final List<Integer> list = new ArrayList<>();

    public Solution380() {

    }

    public Map<Integer, Integer> getMap() {
        return map;
    }

    public List<Integer> getList() {
        return list;
    }

    public boolean insert(int val) {
        if (map.containsKey(val))
            return false;

        list.add(val);
        map.put(val, list.size() - 1);
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        Integer index = map.get(val);
        if (index == null)
            return false;

        if (index != list.size() - 1) {
            int lastVal = list.get(list.size() - 1);
            list.set(index, lastVal);
            map.put(lastVal, index);
        }

        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        if (list.isEmpty())
            return -1;

        int min = 0, max = list.size();
        double random = Math.random();
        int randomIndex = (int) (random * (max - min) + min);
        return list.get(randomIndex);
    }

}
