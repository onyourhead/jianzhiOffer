package niukewang;

/**
 * title: TreeDepth
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 11:54
 */
public class TreeDepth {
    public int solution(TreeNode root) {
        int depth=0;
        if (root==null) {
            return depth;
        }
        int leftDepth=solution(root.left);
        int rightDepth=solution(root.right);
        int subTreeDepth=leftDepth>rightDepth?leftDepth:rightDepth;
        return 1+subTreeDepth;
    }
}
