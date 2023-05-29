package cq.leetcode.answer.esay;

import com.alibaba.fastjson.JSON;
import cq.leetcode.answer.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 5 ms	42 MB
 */
public class No1260_2 implements LeetCode {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        //偏移量
        int size = m * n;
        int x = k % size;
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> integerList = null;
        for (int i = 0; i < size; i++) {
            if (i % n == 0) {
                integerList = new ArrayList<>();
            }
            if (i % n == n - 1) {
                lists.add(integerList);
            }
            //计算偏移后的下标
            int y = i - x;
            if (y < 0) {
                y += size;
            }
            integerList.add(grid[y / n][y % n]);
        }
        return lists;
    }

    @Override
    public void test() {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(JSON.toJSONString(shiftGrid(ints, 1)));
        System.out.println(JSON.toJSONString(shiftGrid(ints, 2)));
        System.out.println(JSON.toJSONString(shiftGrid(ints, 3)));
    }

}
