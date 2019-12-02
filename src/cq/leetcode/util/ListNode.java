package cq.leetcode.util;

public class ListNode {
    public int val;
    public ListNode next;   // 下一个链表对象
    public ListNode(int val) { this.val = val; }  //赋值链表的值

    @Override
    public String toString() {
        if (next==null){
            return val+"";
        }else{
            return val+","+next.toString();
        }
    }
}
