package Algorithm;

public class ReverseList206 {

    //�ݹ�ʵ�ַ�ת����
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return pre;
    }

    //�ǵݹ�ʵ�ַ�ת����
    public ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode temp;
        ListNode q = head;
        while (q.next != null) {
            temp = q.next;
            q.next = pre;
            pre = q;
            q = temp;
        }
        return q;
    }

}
