package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/16
 * Time: 9:12
 * Progect: jianzhiOffer
 */
public class Clone {
    public RandomListNode solution(RandomListNode pHead) {
        /**
         * 采用新节点链接到旧节点后面的方式，最后按奇偶拆除新旧链表
         */
        RandomListNode cur=pHead;
//        1.先在每个节点后复制一个同样的节点
        while (cur!=null) {
            RandomListNode  clone=new RandomListNode(cur.label);
            clone.next=cur.next;
            clone.random=null;
            cur.next=clone;
            cur=clone.next;
        }
//        2.设置新节点的random指针，因为新旧节点紧挨着，所以random指针也紧挨着，时间复杂度是o(1)
        cur=pHead;
        while (cur!=null) {
            RandomListNode curRandom=cur.random;
            RandomListNode cloneRandom=curRandom.next;
            RandomListNode clone=cur.next;
            clone.random=cloneRandom;
            cur=clone.next;
        }
//        3.拆分
        RandomListNode old=pHead;
        RandomListNode cloneHead=old.next;
        RandomListNode clone=cloneHead;
        while (old!=null) {
            old.next=clone.next;
            old=clone.next;
            clone.next=old.next;
            clone=old.next;
        }
        return cloneHead;

    }

    public static void main(String[] args) {

    }
}