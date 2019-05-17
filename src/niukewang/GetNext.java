package niukewang;


/**
 * title: GetNext
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/17
 * time： 8:59
 */
public class GetNext {
    public TreeLinkNode solution(TreeLinkNode pNode) {
        if (pNode == null)
            return null;
        if (pNode.right != null) {
            pNode = pNode.right;
            while (pNode.left != null) {
                pNode = pNode.left;
            }
            return pNode;
        } else {
            while (pNode != null) {
                if (pNode == pNode.next.left)
                    return pNode.next;
                else pNode = pNode.next;
            }
            return null;
        }
    }
}

