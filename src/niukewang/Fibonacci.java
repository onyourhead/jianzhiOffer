package niukewang;

import org.junit.Test;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/29
 * Time: 9:17
 * Progect: jianzhiOffer
 */
public class Fibonacci {
    @Test
    public void main() {
//        System.out.println(solution(100));
        System.out.println(solution2(100));
    }
    public int solution(int n) {
        int p=0,q=1,temp=p;
        for (int i = 0; i < n; i++) {
            temp=p;
            p=q;
            q=temp+q;
        }
        return p;
    }
    public int solution2(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return solution2(n-1) + solution2(n-2);
    }
}
