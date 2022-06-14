package amazon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Amazon582 {

    public List<Integer> killProcess(List<Integer> pid, List<Integer> ppid, int kill) {
        Map<Integer, List<Integer>> nodesMap = new HashMap<>();
        for (int i = 0; i < pid.size(); i++) {
            nodesMap.putIfAbsent(pid.get(i), new ArrayList<>());
            nodesMap.putIfAbsent(ppid.get(i), new ArrayList<>());
            nodesMap.get(ppid.get(i)).add(pid.get(i));
        }

        List<Integer> toBeKilled = new ArrayList<>();
        for (int node: nodesMap.keySet()) {
            if (node == kill) {
                killProcesses(nodesMap, node, toBeKilled);
            }
        }
        return toBeKilled;
    }

    private void killProcesses(Map<Integer, List<Integer>> nodesMap, int node, List<Integer> toBeKilled) {
        toBeKilled.add(node);
        for (int child: nodesMap.get(node)) {
            killProcesses(nodesMap, child, toBeKilled);
        }
    }
}
