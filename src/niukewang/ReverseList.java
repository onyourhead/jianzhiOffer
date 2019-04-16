package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/1
 * Time: 10:54
 * Progect: jianzhiOffer
 */
public class ReverseList {
    public ListNode solution(ListNode head) {
        ListNode cur=head;
        ListNode next;
        ListNode root=null;
        while (cur!=null) {
            next=cur.next;
            cur.next=root;
            root=cur;
            cur=next;
        }
        return root;

    }

    public static void main(String[] args) {
        ListNode cur=null;
        ListNode root=cur;
        cur=new ListNode(1);
        System.out.println(root);
    }
}
