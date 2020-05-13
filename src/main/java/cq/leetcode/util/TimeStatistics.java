package cq.leetcode.util;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author qian.cheng
 *
 * 当前类作为测试参数和测试返回及耗时的展示
 */
@Aspect
@Component
@Slf4j
public class TimeStatistics {


    @Pointcut(value = "execution(public * cq.leetcode.answer.*.*.*(..))")
    public void methodPointcut(){
    }

    @Around(value = "methodPointcut()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint){
        Object result = null;
        try {
            long startTime=System.currentTimeMillis();
            Object[] args=proceedingJoinPoint.getArgs();
            //可以加参数
            result = proceedingJoinPoint.proceed();
            log.info("\n{}" +
                            "\n执行耗时:{} ms" +
                            "\n参数:{}" +
                            "\n返回结果:{}",
                    proceedingJoinPoint.getSignature().getDeclaringTypeName(),
                    System.currentTimeMillis()-startTime,
                    JSONObject.toJSONString(args),
                    JSONObject.toJSONString(result));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return result;
    }

}
