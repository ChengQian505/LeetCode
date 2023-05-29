package cq.leetcode.answer.esay;

import com.alibaba.fastjson.JSON;
import cq.leetcode.answer.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 	11 ms	41.8 MB
 */
public class No1260 implements LeetCode {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int[][] tempArray = new int[grid.length][grid[0].length];
        for (int i = 0; i < k; i++) {
            if (i % 2 == 0) {
                transfer(grid, tempArray);
            } else {
                transfer(tempArray, grid);
            }
        }
        if (k % 2 == 0) {
            tempArray = grid;
        }
        List<List<Integer>> lists = new ArrayList<>();
        for (int[] integers : tempArray) {
            List<Integer> integerList = new ArrayList<>();
            for (int integer : integers) {
                integerList.add(integer);
            }
            lists.add(integerList);
        }
        return lists;
    }

    private void transfer(int[][] grid, int[][] tempArray) {
        int m = grid.length;
        int n = grid[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == m - 1 && j == n - 1) {
                    tempArray[0][0] = grid[i][j];
                } else if (j == n - 1) {
                    tempArray[i + 1][0] = grid[i][n - 1];
                } else {
                    tempArray[i][j + 1] = grid[i][j];
                }
            }
        }
    }

    @Override
    public void test() {
        int[][] ints = {{1,2,3},{4,5,6},{7,8,9}};
        Object result = shiftGrid(ints, 2);
        System.out.println(JSON.toJSONString(result));
    }

}
