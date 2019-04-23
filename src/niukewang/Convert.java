package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/16
 * Time: 14:26
 * Progect: jianzhiOffer
 */
public class Convert {
    public TreeNode solution(TreeNode pRootOfTree) {
        if (pRootOfTree!=null) {
            pRootOfTree=convert(pRootOfTree,"left");
        }
        return pRootOfTree;
    }
    public TreeNode convert(TreeNode root,String side) {
        if (root.left==null && root.right==null)
            return root;
        if (root.left!=null) {
            root.left=convert(root.left,"right");
            root.left.right=root;
        }
        if (root.right!=null) {
            root.right=convert(root.right,"left");
            root.right.left=root;
        }
        if (side.equals("left")) {
            while (root.left!=null)
                root=root.left;
        } else {
            while (root.right!=null)
                root=root.right;
        }
        return root;
    }
}
