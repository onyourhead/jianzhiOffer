package niukewang;

/**
 * title: DeleteDuplication
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 20:01
 */
public class DeleteDuplication {
    public ListNode solution(ListNode pHead) {
        if (pHead==null)
            return null;
        if (pHead.next==null)
            return pHead;
        ListNode leftNode=pHead;
        ListNode rightNode=pHead.next;
        if (leftNode.val==rightNode.val) {
            do {
                rightNode=rightNode.next;
            } while (rightNode!=null && rightNode.val==leftNode.val);
            pHead=rightNode;
            return solution(pHead);
        } else {
            if (rightNode.next!=null && rightNode.val==rightNode.next.val) {
                do {
                    rightNode=rightNode.next;
                } while (rightNode!=null && rightNode.val==leftNode.next.val);
                leftNode.next=solution(rightNode);
            } else {
                rightNode.next=solution(rightNode.next);
            }
            return pHead;
        }
    }
    public ListNode solution1(ListNode pHead) {
        return null;
        
    }
}
