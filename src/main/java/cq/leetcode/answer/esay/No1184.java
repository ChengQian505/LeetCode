package cq.leetcode.answer.esay;

import cq.leetcode.answer.LeetCode;

import java.util.Arrays;

public class No1184 implements LeetCode {
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
    public void test() {
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 1));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 2));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 0, 3));
        System.out.println(distanceBetweenBusStops(new int[]{1, 2, 3, 4}, 2, 0));
    }
}
