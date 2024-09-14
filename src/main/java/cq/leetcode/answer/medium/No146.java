package cq.leetcode.answer.medium;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

/**
 * @author qian.cheng
 * 146. LRU缓存机制
 * TODO 当前支持LinkedHashMap，但最好自己实现双链表
 */
@Component
public class No146 {

    private final LinkedList<Integer> list = new LinkedList<>();

    private final HashMap<Integer, Integer> map = new HashMap<>();

    private final int count;

    public No146(@Value("2") int capacity) {
        count=capacity;
    }

    public int get(int key) {
        Integer v=map.get(key);
        if (v==null){
            return -1;
        }else{
            list.remove((Object)key);
            list.add(key);
            return v;
        }
    }

    public void put(int key, int value) {
        Integer v=map.get(key);
        //如果有该元素，就替换
        if (v!=null){
            map.put(key,value);
            list.remove((Object)key);
            list.add(key);
            //没有该元素，并且集合满了
        }else if (count==list.size()){
            map.remove(list.get(0));
            list.removeFirst();
            map.put(key,value);
            list.add(key);
            //没有该元素，但是集合还没满
        }else{
            map.put(key,value);
            list.add(key);
        }
    }

}
