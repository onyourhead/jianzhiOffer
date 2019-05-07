package niukewang;

/**
 * title: IsBalanced
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 17:09
 */
public class IsBalanced {
    public boolean solution(TreeNode root) {
        if (root==null)
            return true;
        int leftDepth=depth(root.left);
        int rightDepth=depth(root.right);
        int diff=leftDepth>rightDepth?leftDepth-rightDepth:rightDepth-leftDepth;
        if (diff>1)
            return false;
        return true;
    }
    public int depth(TreeNode root) {
        int depth=0;
        if (root==null) {
            return depth;
        }
        int leftDepth=depth(root.left);
        int rightDepth=depth(root.right);
        int subTreeDepth=leftDepth>rightDepth?leftDepth:rightDepth;
        return 1+subTreeDepth;
    }
}
