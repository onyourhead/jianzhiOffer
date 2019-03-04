/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/4
 * Time: 16:00
 * Progect: jianzhiOffer
 */
public class No4 {
//    思路很重要，要充分利用具体情境下的规律，此题如果按照对角线来排除的话会遇到越不过的障碍，从右上角元素进行排除则可以解决问题。
    private int[][] num={
            {1,2,8,9},
        {2,4,9,12},
        {4,7,10,13},
        {6,8,11,15}};
    public boolean isHas(int n) {
        int i=0,j=3;
        while (i>=0 && j>=0) {
            if (num[i][j]<n) {
                i++;
            } else if (num[i][j]>n) {
                j--;
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        No4 no4=new No4();
        System.out.println(no4.isHas(3));
    }
}
