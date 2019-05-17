package niukewang;

import sun.reflect.generics.tree.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * title: TreeNodeTool
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 14:49
 */
public class TreeNodeTool {
    static int i=1;

    public static void main(String[] args) {
        String string="1,2,3,4,#,5,#";
        getTreeNodeHead(string);

    }
    public static TreeNode getTreeNodeHead(String str) {
        String[] nums=str.trim().split(",");
        if (nums.length==0)
            return null;
        if (nums[0].equals("#"))
            return null;
        TreeNode head=new TreeNode(Integer.parseInt(nums[0]));
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            TreeNode cur=queue.poll();
            TreeNode left=null;
            TreeNode right=null;
            if (i<nums.length) {
                if (!nums[i].equals("#")) {
                    left=new TreeNode(Integer.parseInt(nums[i]));
                    queue.add(left);
                }
                i++;
            }
            if (i<nums.length) {
                if (!nums[i].equals("#")) {
                    right=new TreeNode(Integer.parseInt(nums[i]));
                    queue.add(right);
                }
                i++;
            }
            cur.left=left;
            cur.right=right;
        }
        return head;
    }
}
