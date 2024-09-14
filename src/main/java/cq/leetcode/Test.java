package cq.leetcode;

import cq.leetcode.answer.LeetCode1;
import cq.leetcode.answer.esay.No1275;

import java.lang.reflect.InvocationTargetException;

/**
 * @author qian.cheng
 */
public class Test {

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, InvocationTargetException {
        test(No1275.class);
    }

    private static <T extends LeetCode1> void test(Class<T> tClass) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        T t = tClass.newInstance();
        t.test();
    }
}
