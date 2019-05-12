package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/13 1:06
 */
//https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=13&tqId=11168&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入一个链表，反转链表后，输出新链表的表头。
class Fifteen {
    public static void main(String[] args) {

    }

    public static ListNode ReverseList(ListNode head) {
        ListNode current = head;
        ListNode before = null;
        while (current != null) {
            //断链前保存下一个
            ListNode tmp = current.next;
            //逆向
            current.next = before;

            //后移
            before = current;
            current = tmp;
        }
        return before;
    }

    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
