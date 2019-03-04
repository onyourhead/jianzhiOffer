/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/4
 * Time: 17:09
 * Progect: jianzhiOffer
 */
public class ReverseLink {
    public void reverse(Node node) {
        Node head=node;
        Node cur=node;
        Node next=cur.next;
        while (next!=null) {
            cur=next;
            next=next.next;
            cur.next=head;
            head=cur;
        }
    }
    public static void main(String[] args) {
        Node init=new Node();

    }
}
class Node {
    private int value;
    public Node next;
}
