/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/7
 * Time: 9:15
 * Progect: jianzhiOffer
 */
public class BinaryTreeNode {
    private int value;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    public BinaryTreeNode(int value) {
        this.value = value;
        this.left=null;
        this.right=null;
    }

    public BinaryTreeNode(int value, BinaryTreeNode left, BinaryTreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
