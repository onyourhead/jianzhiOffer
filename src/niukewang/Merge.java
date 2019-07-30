package niukewang;

/**
 * @ClassName: Merge
 * @Description: TODO
 * @Author: zhangzhengqi
 * @DateTime: 2019/7/29 14:58
 * @Version: 1.0
 */
public class Merge {
    public ListNode solution(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode res = new ListNode(0);
        ListNode newCur = res;

        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                ListNode next = new ListNode(cur1.val);
                newCur.next = next;
                newCur = next;
                cur1 = cur1.next;
            } else {
                ListNode next = new ListNode(cur2.val);
                newCur.next = next;
                newCur = next;
                cur2 = cur2.next;
            }
        }
        if (cur1 != null) {
            newCur.next = cur1;
        }
        if (cur2 != null) {
            newCur.next = cur2;
        }
        return res.next;


    }
    public static void main(String[] args) {
        Merge merge = new Merge();
        ListNode list1 = ListNodeTool.getHead(new int[]{1, 3, 5, 7});
        ListNode list2 = ListNodeTool.getHead(new int[]{2, 4, 6, 8});
        ListNode head = merge.solution(list1, list2);
        System.out.println(head);
    }
}
