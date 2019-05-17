package niukewang;

import java.util.LinkedList;
import java.util.Queue;

/**
 * title: SerializeAndDeserializeTreeNode
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 16:01
 */
public class SerializeAndDeserializeTreeNode {
    public static void main(String[] args) {
        SerializeAndDeserializeTreeNode ex=new SerializeAndDeserializeTreeNode();
    }
    String Serialize(TreeNode root) {
        if (root==null)
            return "";
        StringBuffer sb=new StringBuffer();
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode cur=queue.poll();
            sb.append(cur.val+",");
            if (cur.left!=null) {
                queue.add(cur.left);
            }
            if (cur.right!=null) {
                queue.add(cur.right);
            }
        }
        return sb.substring(0,sb.length()-1);

    }
    TreeNode Deserialize(String str) {
        String[] strings=str.split(",");
        if (strings.length==0)
            return null;
        int[] nums=new int[strings.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i]= Integer.parseInt(strings[i]);
        }
        TreeNode head=new TreeNode(nums[0]);
        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(head);
        int j=1;
        while (!queue.isEmpty()) {
            if (j>=nums.length)
                break;
            TreeNode cur=queue.poll();
            TreeNode left=null;
            TreeNode right=null;
            if (j<nums.length) {
                left=new TreeNode(nums[j]);
                queue.add(left);
                j++;
            }
            if (j<nums.length) {
                right=new TreeNode(nums[j]);
                queue.add(right);
                j++;
            }
            cur.left=left;
            cur.right=right;
        }
        return head;

    }
}
