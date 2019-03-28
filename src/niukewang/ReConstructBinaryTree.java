package niukewang;


import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/28
 * Time: 15:45
 * Progect: jianzhiOffer
 */
public class ReConstructBinaryTree {
    public TreeNode solution(int[] pre, int[] in) {
        if (pre.length == 0)
            return null;
        if (pre.length==1)
            return new TreeNode(pre[0]);
        if (pre.length == 2) {
            TreeNode cur = new TreeNode(pre[0]);
            if (indexOf(pre[0], in) == 1) {
                cur.left = new TreeNode(pre[1]);
            } else {
                cur.right = new TreeNode(pre[1]);
            }
            return cur;
        }
        int indexOfHead = indexOf(pre[0], in);
        TreeNode head = new TreeNode(pre[0]);
        TreeNode left = solution(Arrays.copyOfRange(pre, 1, indexOfHead + 1), Arrays.copyOfRange(in, 0, indexOfHead));
        TreeNode right = solution(Arrays.copyOfRange(pre, indexOfHead + 1, pre.length), Arrays.copyOfRange(in, indexOfHead + 1, in.length));
        head.left = left;
        head.right = right;
        return head;
    }

    public int indexOf(int num, int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == num)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] pre={1,2,4,7,3,5,6,8};
        int[] in={4,7,2,1,5,3,8,6};
        ReConstructBinaryTree rc=new ReConstructBinaryTree();
        rc.solution(pre,in);
    }
}
