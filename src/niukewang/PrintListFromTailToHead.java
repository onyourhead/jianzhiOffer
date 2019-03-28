package niukewang;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/28
 * Time: 10:18
 * Progect: jianzhiOffer
 */
public class PrintListFromTailToHead {
    public ArrayList<Integer> solution(ListNode listNode) {
        Stack<Integer> stack=new Stack<>();
        while (listNode!=null) {
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> arrayList=new ArrayList<>();
        while (!stack.empty()) {
            arrayList.add(stack.pop());
        }
        return arrayList;
    }

    public static void main(String[] args) {
        PrintListFromTailToHead pl=new PrintListFromTailToHead();
        int[] nums={67,0,24,58};
        ListNode head=new ListNode(nums[0]);
        ListNode cur=head;
        for (int i = 1; i < nums.length; i++) {
            cur.next=new ListNode(nums[i]);
            cur=cur.next;
        }
        pl.solution(head);

    }
}
