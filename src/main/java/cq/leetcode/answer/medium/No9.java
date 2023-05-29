package cq.leetcode.answer.medium;

import com.alibaba.fastjson.JSONObject;
import cq.leetcode.ProgressWatch;

import java.util.*;

/**
 * @author qian.cheng
 * 90. 子集 II
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 * <p>
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,2]
 * 输出：[[],[1],[1,2],[1,2,2],[2],[2,2]]
 * 示例 2：
 * <p>
 * 输入：nums = [0]
 * 输出：[[],[0]]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */
public class No9 extends ProgressWatch {

    List<Integer> t = new ArrayList<Integer>();
    List<List<Integer>> ans = new ArrayList<List<Integer>>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        System.out.println(JSONObject.toJSONString(nums));
        List<List<Integer>> listList = new ArrayList<>();
        Integer lastNum = null;
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = 0; i1 < nums.length; i1++) {

            }
        }
        for (int nowNum : nums) {
            integerList.add(nowNum);
            if (null == lastNum || lastNum != nowNum) {

                listList.add(integerList);
            }
            lastNum = nowNum;
        }
        listList.add(new ArrayList<>());
        return listList;
    }

    @Override
    public void test() {
        execute(new int[]{1, 2, 2});
        execute(new int[]{0});
    }

    @Override
    protected Object run(Object... object) {
        return subsetsWithDup((int[]) object[0]);
    }
}
