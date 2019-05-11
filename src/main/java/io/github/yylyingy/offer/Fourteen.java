package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/12 1:17
 */
//https://www.nowcoder.com/practice/529d3ae5a407492994ad2a246518148a?tpId=13&tqId=11167&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入一个链表，输出该链表中倒数第k个结点。
class Fourteen {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        listNode.next.next.next.next = new ListNode(5);
        FindKthToTail2(listNode,2);
    }

    public static ListNode FindKthToTail(ListNode head,int k) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        int length = 1;
        while (current != null) {
            current = current.next;
            if (current != null) {
                length ++;
            }
        }
        int index = length - k;
        if (k > length) {
            return null;
        }
        current = head;
        for (int i = 0;;i ++){
            if (index == i) {
                break;
            }
            current = current.next;
        }
        return current;

    }

    public static ListNode FindKthToTail2(ListNode head,int k) {
        ListNode p = head,q = head;
        int i = 0;
        for (;p != null;i ++) {
            //先让p指针往下走，当p走了k个node时q开始走，这时p还剩 链表长度 - k个节点没走完（这个长度就是倒数k位置，
            //正数位置等于长度 - k;)
            if (i >= k) {
                q = q.next;
            }
            p = p.next;
        }
        return i < k ? null : q;
    }
    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
}
