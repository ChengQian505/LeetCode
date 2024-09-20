package cq.leetcode;

import cn.hutool.core.date.StopWatch;
import com.alibaba.fastjson.JSON;
import lombok.Builder;
import lombok.Data;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author qian.cheng
 */
public abstract class LeetCode1 {

    protected abstract List<OC> params();

    public void test() throws InvocationTargetException, IllegalAccessException {
        Method method = Arrays.stream(this.getClass().getMethods()).filter(a -> a.getModifiers() == Modifier.PUBLIC).collect(Collectors.toList()).get(0);
        for (OC oc : params()) {
            Object[] param = oc.param;
            System.out.println("请求参数：" + JSON.toJSONString(param));
            StopWatch stopWatch = new StopWatch();
            stopWatch.start();
            Object result = method.invoke(this, param);
            stopWatch.stop();
            Object result1 = oc.result;
            boolean equals = true;
            if (result1 != null) {
                equals = resultCompare(result, result1);
            }
            if (equals) {
                System.out.println("通过：" + JSON.toJSONString(result));
            } else {
                System.err.println("解答错误  输出：" + JSON.toJSONString(result) + " 预期：" + JSON.toJSONString(result1));
            }
            System.out.println("耗时：" + getPrintTime(stopWatch.getLastTaskTimeNanos()));
        }
    }

    private boolean resultCompare(Object result, Object result1) {
        if (result instanceof String) {
            return result.equals(result1);
        }
        return false;
    }

    @Builder
    public static class OC {
        private Object[] param;
        private Object result;
    }

    private String getPrintTime(Long nanoTime) {
        //毫秒
        long ms1 = 1000000;
        //秒
        long s1 = ms1 * 1000;
        //分
        long mi = s1 * 60;
        //时
        long hh = mi * 60;
        //天
        long dd = hh * 24;

        long day = nanoTime / dd;
        long hour = (nanoTime - day * dd) / hh;
        long minute = (nanoTime - day * dd - hour * hh) / mi;
        long second = (nanoTime - day * dd - hour * hh - minute * mi) / s1;
        long ms = (nanoTime - day * dd - hour * hh - minute * mi - second * s1) / ms1;
        long ns = nanoTime - day * dd - hour * hh - minute * mi - second * s1 - ms * ms1;
        StringBuilder sb = new StringBuilder();
        if (day > 0) {
            sb.append(day).append("天");
        }
        if (hour > 0) {
            sb.append(hour).append("小时");
        }
        if (minute > 0) {
            sb.append(minute).append("分钟");
        }
        if (second > 0) {
            sb.append(second).append("秒");
        }
        if (ms > 0) {
            sb.append(ms).append("毫秒");
        }
        if (ns > 0) {
            sb.append(ns).append("纳秒");
        }
        return sb.toString();
    }

}
