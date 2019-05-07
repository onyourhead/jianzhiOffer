package niukewang;

/**
 * title: ListNodeTool
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 11:34
 */
public class ListNodeTool {
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        ListNodeTool.getHead(nums);
    }
    public static ListNode getHead(int[] nums) {
        if (nums.length==0)
            return null;
        ListNode cur=new ListNode(nums[0]);
        ListNode head=cur;
        for (int i = 1; i < nums.length; i++) {
            ListNode next=new ListNode(nums[i]);
            cur.next=next;
            cur=next;
        }
        return head;
    }
}
