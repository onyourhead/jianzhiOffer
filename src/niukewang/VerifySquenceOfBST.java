package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/11
 * Time: 19:24
 * Progect: jianzhiOffer
 */
public class VerifySquenceOfBST {
    public  boolean solution(int[] sequence) {
        if (sequence.length==0) {
            return false;
        }
        return isBST(sequence,0,sequence.length-1);
    }

    private boolean isBST(int[] sequence, int start, int end) {
        if (start>=end)
            return true;
        int root=sequence[end];
        int i=start;
        for (; i < end; i++) {
            if (sequence[i]>root)
                break;
        }
        int j=i;
        for (; j < end; j++) {
            if (sequence[j]<root)
                return false;
        }
        return isBST(sequence,start,i-1) && isBST(sequence,i,end-1);
    }

    public static void main(String[] args) {
        int[] num={2,6,5,9,13,10,7};
        VerifySquenceOfBST bst=new VerifySquenceOfBST();
        System.out.println(bst.solution(num));
    }
}
