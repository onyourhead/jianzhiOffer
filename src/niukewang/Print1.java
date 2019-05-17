package niukewang;

import java.util.ArrayList;
import java.util.Stack;

/**
 * title: Print1
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/17
 * time： 10:37
 */
public class Print1 {
    Stack<TreeNode> oddStack = new Stack<>();
    Stack<TreeNode> evenStack = new Stack<>();
    ArrayList<ArrayList<Integer>> resultList = new ArrayList<>();

    public static void main(String[] args) {
        String str="1,2,3,4,#,#,5,#,6,#,#,#,#,7,#";
        TreeNode head=TreeNodeTool.getTreeNodeHead(str);
        Print1 ex=new Print1();
        ex.solution(head);

    }

    public ArrayList<ArrayList<Integer>> solution(TreeNode pRoot) {
        if (pRoot==null)
            return resultList;
        oddStack.push(pRoot);
        while (!oddStack.isEmpty() || !evenStack.isEmpty()) {
            ArrayList<Integer> oddList=new ArrayList<>();
            ArrayList<Integer> evenList=new ArrayList<>();
            while (!oddStack.isEmpty()) {
                TreeNode cur= oddStack.pop();
                oddList.add(cur.val);
                if (cur.left!=null) {
                    evenStack.push(cur.left);
                }
                if (cur.right!=null)
                    evenStack.push(cur.right);
            }
            if (!oddList.isEmpty())
                resultList.add(oddList);
            while (!evenStack.isEmpty()) {
                TreeNode cur= evenStack.pop();
                evenList.add(cur.val);
                if (cur.right!=null) {
                    oddStack.push(cur.right);
                }
                if (cur.left!=null)
                    oddStack.push(cur.left);
            }
            if (!evenList.isEmpty())
                resultList.add(evenList);
        }
        return resultList;
    }

}
