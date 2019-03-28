package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/28
 * Time: 9:07
 * Progect: jianzhiOffer
 */
public class Find {
    public boolean solution(int target, int [][] array) {
        if (array.length==0)
            return false;
        int m=array.length-1;
        int n=array[0].length-1;
        int i=0,j=n;
        while (i<=m || j>=0) {
            if (array[i][j]<target) {
                if (i==m)
                    return false;
                i++;
            } else if (array[i][j]>target) {
                if (j==0)
                    return false;
                j--;
            } else
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int target=16;
        int[][] array={{}};
        System.out.println(array[0]);
    }

}
