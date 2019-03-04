import java.math.BigInteger;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/4
 * Time: 15:05
 * Progect: jianzhiOffer
 */
public class No32 {
    private int[] num={2,3,5,4,3,2,6,7};
    public int erfen(int begin,int end) {
        if (begin==end)
            return begin;
        int middle=(begin+end)/2;
        int leftCount=0,rightCount=0;
        for (int i = 0; i < num.length; i++) {
            if (num[i]>=begin && num[i]<=middle)
                leftCount++;
            if (num[i]>middle && num[i]<=end)
                rightCount++;
            if (leftCount>middle-begin+1)
                return erfen(begin,middle);
            if (rightCount>end-middle)
                return erfen(middle+1,end);
        }
        return -1;
    }

    public static void main(String[] args) {
        No32 no32=new No32();
        int result=no32.erfen(1,7);
        System.out.println(result);
    }
}
