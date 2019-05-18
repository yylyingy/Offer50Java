package io.github.yylyingy.offer;

/**
 * <br> ClassName:
 * <br> Description: todo(这里用一句话描述这个类的作用)
 * <br>
 * <br> Author:      Yangyl
 * <br> Date:        2019/5/18 23:01
 */
//https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=13&tqId=11169&tPage=1&rp=1&ru=%2Fta%2Fcoding-interviews&qru=%2Fta%2Fcoding-interviews%2Fquestion-ranking
//    输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
class Sixteen {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        listNode1.next = new ListNode(3);
        listNode1.next.next = new ListNode(5);
//        listNode1.next.next.next = new ListNode(7);
//        listNode1.next.next.next.next = new ListNode(9);
        ListNode listNode2 = new ListNode(2);
        listNode2.next = new ListNode(4);
        listNode2.next.next = new ListNode(6);
//        listNode2.next.next.next = new ListNode(8);
//        listNode2.next.next.next.next = new ListNode(10);
        ListNode listNode = Merge(listNode1,listNode2);
        System.out.println();
    }

    static ListNode Merge(ListNode list1,ListNode list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        ListNode root = null;
        ListNode rootCurrent = null;
		ListNode tmp1 = list1;
		ListNode tmp2 = list2;
		if(list1.val < list2.val) {
			root = new ListNode(list1.val);
			tmp1 = tmp1.next;
            rootCurrent = root;
		}
		if(list1.val > list2.val) {
			root = new ListNode(list2.val);
			tmp2 = tmp2.next;
			rootCurrent = root;
		}
		if(list1.val == list2.val) {
			root = new ListNode(list1.val);
			root.next = new ListNode(list2.val);
			rootCurrent = root.next;
            tmp1 = tmp1.next;
            tmp2 = tmp2.next;
		}
        while (tmp1 != null || tmp2 != null) {
            if(tmp1 == null) {
                rootCurrent.next = tmp2;
                break;
            }
            if(tmp2 == null) {
                rootCurrent.next = tmp1;
                break;
            }
            if(tmp1.val < tmp2.val) {
				rootCurrent.next = new ListNode(tmp1.val);
				tmp1 = tmp1.next;
				rootCurrent = rootCurrent.next;
			} else if(tmp1.val > tmp2.val) {
				rootCurrent.next = new ListNode(tmp2.val);
				tmp2 = tmp2.next;
				rootCurrent = rootCurrent.next;
			} else {
				rootCurrent.next = new ListNode(tmp1.val);
				rootCurrent = rootCurrent.next;
				tmp1 = tmp1.next;
				rootCurrent.next = new ListNode(tmp2.val);
				rootCurrent = rootCurrent.next;
				tmp2 = tmp2.next;
			}
           
        }
        return root;
    }


    static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

    }
}
