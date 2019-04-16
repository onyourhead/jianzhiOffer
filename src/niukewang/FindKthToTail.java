package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/1
 * Time: 10:03
 * Progect: jianzhiOffer
 */
public class FindKthToTail {
    public ListNode solution(ListNode head,int k) {
//        双节点一起移动，后面的节点到了末尾，开头的节点也就到了倒数第k个
        if (head==null)
            return null;
        ListNode first=head;
        ListNode second=head;
        for (int i = 0; i < k; i++) {
            if (second==null)
                return null;
            second=second.next;
        }
        while (second!=null) {
            first=first.next;
            second=second.next;
        }
        return first;

    }
}
