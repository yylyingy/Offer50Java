package io.github.yylyingy.offer;

import java.util.Stack;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/7 20:03
 */
//https://www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
class Fifth {
    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        System.out.println(pop());
        System.out.println(pop());
        push(4);
        System.out.println(pop());//1
        push(5);
        System.out.println(pop());//2
        System.out.println(pop());//3

    }

    static Stack<Integer> stack1 = new Stack<Integer>();
    static Stack<Integer> stack2 = new Stack<Integer>();

    public static void push(int node) {
        Integer integer = node;
        while (!stack2.isEmpty()) {
            //stack1存放插入顺序的的栈
            stack1.push(stack2.pop());
        }
        stack1.push(integer);
    }

    public static int pop() {
        while (!stack1.isEmpty()) {
            //stack2存放倒序的栈
            stack2.push(stack1.pop());
        }
        //倒序的栈出栈即为队列的先进先出
        return stack2.pop();
    }
}
