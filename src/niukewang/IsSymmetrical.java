package niukewang;

import java.util.ArrayList;

/**
 * title: IsSymmetrical
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/17
 * time： 9:38
 */
public class IsSymmetrical {
    ArrayList<Integer> inOrderList=new ArrayList<>();
    boolean solution(TreeNode pRoot) {
//        得到中序遍历数组，看数组是否对称
        if (pRoot==null)
            return true;
        inOrder(pRoot);
        int size=inOrderList.size();
        int left=0,right=size-1;
        while (left<right) {
            if (inOrderList.get(left)!=inOrderList.get(right))
                return false;
            else {
                left++;
                right--;
            }
        }
        return true;
    }
    public void inOrder(TreeNode root) {
        if (root.left!=null)
            inOrder(root.left);
        inOrderList.add(root.val);
        if (root.right!=null)
            inOrder(root.right);
    }
}
