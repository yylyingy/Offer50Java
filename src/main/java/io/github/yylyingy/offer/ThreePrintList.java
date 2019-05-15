package io.github.yylyingy.offer;

import java.util.ArrayList;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/4/29 13:30
 */

class ThreePrintList {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(4);
        listNode1.next = new ListNode(8);
        listNode1.next.next = new ListNode(6);
        print(listNode1);
    }

    static ArrayList<Integer> print(ListNode listNode) {
        if (listNode == null) {
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        ListNode current = listNode;
        ListNode forward = null;
        ListNode next = null;
        while (current != null) {
            next = current.next;
            current.next = forward;
            forward = current;
            current = next;
        }
        while (forward != null) {
            result.add(forward.val);
            forward = forward.next;
        }
        return result;
    }


    public static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }


}
