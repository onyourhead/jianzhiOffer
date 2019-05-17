package niukewang;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * title: Print2
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 16:36
 */
public class Print2 {
    ArrayList<ArrayList<Integer>> solution(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();
        if (pRoot == null)
            return resultList;
        Queue<TreeNode> oddQueue = new LinkedList<>();
        Queue<TreeNode> evenQueue = new LinkedList<>();
        oddQueue.add(pRoot);
        while (!oddQueue.isEmpty() || !evenQueue.isEmpty()) {
            ArrayList<Integer> oddList = new ArrayList<>();
            ArrayList<Integer> evenList = new ArrayList<>();
            while (!oddQueue.isEmpty()) {
                TreeNode cur = oddQueue.poll();
                oddList.add(cur.val);
                if (cur.left != null) {
                    evenQueue.add(cur.left);
                }
                if (cur.right != null)
                    evenQueue.add(cur.right);
            }
            if (!oddList.isEmpty())
                resultList.add(oddList);
            while (!evenQueue.isEmpty()) {
                TreeNode cur = evenQueue.poll();
                evenList.add(cur.val);
                if (cur.left != null)
                    oddQueue.add(cur.left);
                if (cur.right != null) {
                    oddQueue.add(cur.right);
                }
            }
            if (!evenList.isEmpty())
                resultList.add(evenList);
        }
        return resultList;
    }
}
