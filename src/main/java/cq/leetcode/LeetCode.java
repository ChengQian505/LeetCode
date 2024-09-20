package cq.leetcode;

import com.alibaba.fastjson.JSON;

/**
 * @author qian.cheng
 */
public interface LeetCode {

    /**
     * 测试方法
     */
    void test();

    default void print(Object o){
        System.out.println(JSON.toJSONString(o));
    }

}
