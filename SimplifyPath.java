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

public class SimplifyPath {

    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();
        Set<String> skip = new HashSet<>(Arrays.asList("..", ".", ""));
        for (String dir : path.split("/")) {
            if (dir.equals("..") && !stack.isEmpty()) {
                stack.pop();
            } else if (!skip.contains(dir)) {
                stack.push(dir);
            }
        }
        String res = "";
        for (String dir : stack) {
            res = "/" + dir + res;
        }
        return res.isEmpty() ? "/" : res;
    }
}
