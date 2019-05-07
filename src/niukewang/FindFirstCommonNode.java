package niukewang;

/**
 * title: FindFirstCommonNode
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 11:02
 */
public class FindFirstCommonNode {
    public static void main(String[] args) {
        int[] array1={1,3,5,7};
        int[] array2={5,7};
        ListNode node1=ListNodeTool.getHead(array1);
        ListNode node2=ListNodeTool.getHead(array2);
        FindFirstCommonNode ex=new FindFirstCommonNode();
        ex.solution(node1,node2);
    }
    public ListNode solution(ListNode pHead1, ListNode pHead2) {
        if (pHead1==null || pHead2==null)
            return null;
        int length1 = 0, length2 = 0;
        ListNode cur=pHead1;
        while (cur != null) {
            length1++;
            cur = cur.next;
        }
        cur=pHead2;
        while (cur != null) {
            length2++;
            cur = cur.next;
        }
        int distance = length1 > length2 ? length1 - length2 : length2 - length1;
        if (length1 > length2) {
            for (int i = 0; i < distance; i++) {
                pHead1 = pHead1.next;
            }
        } else {
            for (int i = 0; i < distance; i++) {
                pHead2 = pHead2.next;
            }
        }
        while (pHead1!=null) {
            if (pHead1.val==pHead2.val)
                return pHead1;
            pHead1=pHead1.next;
            pHead2=pHead2.next;
        }
        return null;
    }
}
