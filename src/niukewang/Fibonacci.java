package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/29
 * Time: 9:17
 * Progect: jianzhiOffer
 */
public class Fibonacci {
    public int solution(int n) {
        int p=0,q=1,temp=p;
        for (int i = 0; i < n; i++) {
            temp=p;
            p=q;
            q=temp+q;
        }
        return p;
    }
}
