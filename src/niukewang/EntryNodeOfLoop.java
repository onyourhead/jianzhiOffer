package niukewang;

/**
 * title: EntryNodeOfLoop
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 19:49
 */
public class EntryNodeOfLoop {
    public ListNode solution(ListNode pHead) {
        if (pHead == null || pHead.next == null || pHead.next.next == null)
            return null;
        ListNode onceNode = pHead;
        ListNode twiceNode = pHead;
        do {
            onceNode = onceNode.next;
            twiceNode = twiceNode.next.next;
        }
        while (onceNode != twiceNode);
        onceNode=pHead;
        while (onceNode != twiceNode) {
            onceNode = onceNode.next;
            twiceNode = twiceNode.next;
        } ;
        return onceNode;
    }
}
