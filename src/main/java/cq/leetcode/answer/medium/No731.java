package cq.leetcode.answer.medium;

import java.util.HashMap;
import java.util.Map;

/**
 * @author qian.cheng
 */
public class No731 {

    private final Map<Integer, Integer> map = new HashMap<>();

    public boolean book(int start, int end) {
        for (int i = start; i < end; i++) {
            Integer integer = map.get(i);
            if (integer != null && integer == 2) {
                return false;
            }
        }
        for (int i = start; i < end; i++) {
            Integer integer = map.get(i);
            integer = integer == null ? 0 : integer;
            map.put(i, integer + 1);
        }
        return true;
    }


}
