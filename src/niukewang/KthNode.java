package niukewang;

/**
 * title: KthNode
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 14:27
 */
public class KthNode {
    int count = 0;
    TreeNode node;

    public static void main(String[] args) {
//        int[] nums={8,6,10,5,7,9,11};
//        TreeNode head=TreeNodeTool.getTreeNodeHead(nums);
//        KthNode ex=new KthNode();
//        ex.solution(head,2);
    }

    TreeNode solution(TreeNode pRoot, int k) {
        if (pRoot==null)
            return null;
        search(pRoot,k);
        return node;
    }
    public void search(TreeNode pRoot,int k) {
        if (count > k)
            return;
        if (pRoot.left != null)
            search(pRoot.left, k);
        count++;
        if (count == k)
            node=pRoot;
        if (pRoot.right!=null)
            search(pRoot.right,k);
    }
}
