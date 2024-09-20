package cq.leetcode.answer;

import cq.leetcode.LeetCode1;

import java.util.Arrays;
import java.util.List;

public class No1184 extends LeetCode1 {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int[] newArray;
        if (start > destination) {
            newArray = Arrays.copyOfRange(distance, destination, start);
        } else {
            newArray = Arrays.copyOfRange(distance, start, destination);
        }
        int total = Arrays.stream(distance).sum();
        int sum = Arrays.stream(newArray).sum();
        if (sum * 2 > total) {
            return total - sum;
        } else {
            return sum;
        }
    }

    @Override
    protected List<OC> params() {
        return null;
    }

    @Override
    public void test() {
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 2, 0));
    }
}
