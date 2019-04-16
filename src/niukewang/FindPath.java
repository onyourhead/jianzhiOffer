package niukewang;

import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/13
 * Time: 18:42
 * Progect: jianzhiOffer
 */
public class FindPath {
    ArrayList<ArrayList<Integer>> allPath=new ArrayList<>();
    ArrayList<Integer> path=new ArrayList<>();
    public ArrayList<ArrayList<Integer>> solution(TreeNode root, int target) {
        if (root!=null)
            findPath(root,target);
        return allPath;
    }

    private void findPath(TreeNode root, int target) {
        path.add(root.val);
        if (root.left==null && root.right==null && root.val==target)
            allPath.add(new ArrayList<>(path));
        if (root.left!=null)
            findPath(root.left,target-root.val);
        if (root.right!=null)
            findPath(root.right,target-root.val);
        path.remove(path.size()-1);
    }

}
