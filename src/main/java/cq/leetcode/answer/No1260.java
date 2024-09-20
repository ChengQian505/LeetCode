package cq.leetcode.answer;

import com.alibaba.fastjson.JSON;
import cq.leetcode.LeetCode;
import cq.leetcode.LeetCode1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 	11 ms	41.8 MB
 */
public class No1260 extends LeetCode1 {

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
    protected List<OC> params() {
        return List.of();
    }

    @Override
    public void test() {
        int[][] ints = {{1,2,3},{4,5,6},{7,8,9}};
        Object result = shiftGrid(ints, 2);
        System.out.println(JSON.toJSONString(result));
    }

}
