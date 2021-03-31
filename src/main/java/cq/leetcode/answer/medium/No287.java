package cq.leetcode.answer.medium;

import cq.leetcode.ProgressWatch;
import org.springframework.stereotype.Component;

import java.util.HashMap;

/**
 * @author qian.cheng
 * 287. 寻找重复数
 */
@Component
public class No287 extends ProgressWatch {

    public int findDuplicate(int[] nums) {
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        for (int num:nums){
            if (hashMap.get(num)==null){
                hashMap.put(num,0);
            }else{
                return num;
            }
        }
        return -1;
    }

    @Override
    public void test() {
        execute(new int[]{3,1,3,4,2});
        execute(new int[]{1,3,4,2,2});
    }

    @Override
    protected Object run(Object... object) {
        return findDuplicate((int[]) object[0]);
    }
}
