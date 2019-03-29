package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/29
 * Time: 9:24
 * Progect: jianzhiOffer
 */
public class JumpFloor {
    public int solution(int target) {
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        return solution(target-1)+solution(target-2);

    }
}
