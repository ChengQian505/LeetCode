package cq.leetcode.answer;

import com.alibaba.fastjson.JSON;
import cq.leetcode.LeetCode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qian.cheng
 * 4 ms	41.9 MB
 */
public class No1260_1 implements LeetCode {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        //将二维数组放在一维数组里
        int[] tempArray = new int[m * n];
        for (int i = 0; i < grid.length; i++) {
            System.arraycopy(grid[i], 0, tempArray, i * n, n);
        }
        //如果执行了n*m次迁移，则等于无迁移。所以除余
        int x = k % (n * m);
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> integerList = null;
        for (int i = 0; i < tempArray.length; i++) {
            //y是要取的下标，前移x位
            int y = i - x;
            if (y < 0) {
                y += tempArray.length;
            }
            if (i % n == 0) {
                integerList = new ArrayList<>();
            }
            integerList.add(tempArray[y]);
            if (i % n == n - 1) {
                lists.add(integerList);
            }
        }
        return lists;
    }

    @Override
    public void test() {
        int[][] ints = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Object result = shiftGrid(ints, 1);
        System.out.println(JSON.toJSONString(result));
    }

}
