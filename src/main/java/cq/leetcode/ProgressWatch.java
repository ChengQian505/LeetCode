package cq.leetcode;

import com.alibaba.fastjson.JSONObject;


/**
 * @author qian.cheng
 */
public abstract class ProgressWatch {

    /**
     * 方法体只需要写execute();
     */
    public abstract void test();

    /**
     * 处理具体的处理方法
     *
     * @param object 入参
     * @return 返回
     */
    protected abstract Object run(Object... object);

    protected void execute(Object... object) {
        Long start = System.nanoTime();
        //可以加参数
        Object returnObject = run(object);
        Long end = System.nanoTime();
        String stringBuilder = "\n执行实例:" + this.getClass().getName() +
                "\n执行耗时:" + getPrintTime(end - start) +
                "\n参数:" + JSONObject.toJSONString(object) +
                "\n返回结果:" + JSONObject.toJSONString(returnObject);
        System.out.println(stringBuilder);
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
