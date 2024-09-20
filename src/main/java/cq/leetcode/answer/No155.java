package cq.leetcode.answer;



import java.util.Stack;

/**
 * @author qian.cheng
 * 155.最小栈
 *
 * 思路：
 * 建一个辅助栈，存放最小值
 * 删除操作-跟随主栈进行删除
 * 增加操作-判断辅助栈顶层元素和当前插入元素，增加小的
 */
public class No155 {

    Stack<Integer> stack = new Stack<>();

    Stack<Integer> minStack = new Stack<>();

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty()){
            minStack.push(x);
        } else if (minStack.peek() < x) {
            minStack.push(minStack.peek());
        } else {
            minStack.push(x);
        }
    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }
}
