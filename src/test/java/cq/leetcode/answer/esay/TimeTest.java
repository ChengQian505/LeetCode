package cq.leetcode.answer.esay;


import cq.leetcode.answer.hard.No239;
import cq.leetcode.answer.medium.No560;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author qian.cheng
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TimeTest {

    @Autowired
    No560 no239;

    @Test
    public void test(){
        no239.subarraySum(new int[]{28,54,7,-70,22,65,-6},100);
    }
}