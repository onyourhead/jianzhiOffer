package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/1
 * Time: 8:29
 * Progect: jianzhiOffer
 */
public class Power {
    public double solution(double base, int exponent) {
        double result=1d;
        if (exponent>0) {
            while (exponent>0) {
                result*=base;
                exponent--;
            }
            return result;
        } else if (exponent<0) {
            while (-exponent>0) {
                result*=base;
                exponent++;
            }
            return 1/result;
        } else return 1;
    }
}
