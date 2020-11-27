/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gabecorella
 */
import java.util.*;

public class PerfectSquares {

    public int perfectSquares(int n) {

        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set = new HashSet<>();

        queue.offer(0);
        set.add(0);
        int depth = 0;
        while (!queue.isEmpty()) {
            ++depth;
            int size = queue.size();
            
            while (size-- > 0) {
                int u = queue.poll();
                for (int i = 1; i * i <= n; i++) {
                    int v = u + i * i;
                    if (v == n) {
                        return depth;
                    }
                    if (v > n) {
                        break;
                    }
                    if (!set.contains(v)) {
                        queue.offer(v);
                        set.add(v);
                    }
                }
            }
        }

        return depth;
    }
}