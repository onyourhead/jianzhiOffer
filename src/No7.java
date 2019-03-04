import java.util.Arrays;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/7
 * Time: 9:16
 * Progect: jianzhiOffer
 */
public class No7 {
//    用递归来做，通过前序和中序，将序列分为根节点和左子树以及右子树，再在左右子树里用递归解决结构问题。
    public static BinaryTreeNode buildSubTree(List<Integer> preorder,List<Integer> inorder) {
        if (preorder.size()==0)
            return null;
        if (preorder.size()==1)
            return new BinaryTreeNode(preorder.get(0));
        int rootValue=preorder.get(0);
        int indexOfRootNodeInInorder=inorder.indexOf(rootValue);
        BinaryTreeNode rootNode=new BinaryTreeNode(rootValue);
        BinaryTreeNode leftNode=buildSubTree(preorder.subList(1,indexOfRootNodeInInorder+1),inorder.subList(0,indexOfRootNodeInInorder));
        BinaryTreeNode rightNode=buildSubTree(preorder.subList(indexOfRootNodeInInorder+1,preorder.size()),inorder.subList(indexOfRootNodeInInorder+1,inorder.size()));
        rootNode.left=leftNode;
        rootNode.right=rightNode;
        return rootNode;
    }

    public static void main(String[] args) {
        Integer[] preorder={1,2,4,7,3,5,6,8};
        Integer[] inorder={4,7,2,1,5,3,8,6};
        buildSubTree(Arrays.asList(preorder),Arrays.asList(inorder));
    }

}
