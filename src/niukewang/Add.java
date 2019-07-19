package niukewang;

import org.junit.Test;

/**
 * @ClassName: Add
 * @Description: TODO
 * @Author: zhangzhengqi
 * @DateTime: 2019/7/17 18:15
 * @Version: 1.0
 */
public class Add {
    @Test
    public void main() {
        System.out.println(solution(-3,5));

    }
    public int solution(int num1, int num2) {
        int sum;
        int and;
        do {
            sum = num1 ^ num2;
            and = num1 & num2;
            and = and << 1;

            num1 = sum;
            num2 = and;

        } while (and != 0);
        return sum;
    }
}
