package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/30
 * Time: 13:14
 * Progect: jianzhiOffer
 */
public class RectCover {
    public int solution(int target) {
        if (target<=0)
            return 0;
        if (target==1)
            return 1;
        if (target==2)
            return 2;
        return solution(target-1)+solution(target-2);
    }

    public static void main(String[] args) {
        RectCover rectCover=new RectCover();
        int result=rectCover.solution(3);
        System.out.println(result);
    }
}
