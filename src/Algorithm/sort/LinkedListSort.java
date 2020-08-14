package Algorithm.sort;

import com.company.test.undone.ListNode;

public class LinkedListSort {
    public static void main(String[] args) {

    }
    public ListNode sortList(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode midNode = middleNode(head);
        ListNode rightHead = midNode.next;
        midNode.next = null;

        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);
        return merge(left,right);
    }
    public ListNode middleNode(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode left,ListNode right){
        ListNode res = new ListNode();
        ListNode q = res;
        while (left != null && right != null){
            if (left.val < right.val){
                q.next = left;
                left = left.next;
            }else {
                q.next = right;
                right = right.next;
            }
            q = q.next;
        }
        if (left != null){
            q.next = left;
        }else {
            q.next = right;
        }
        return res.next;
    }
}
