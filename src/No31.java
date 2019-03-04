import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/3
 * Time: 18:11
 * Progect: jianzhiOffer
 */
public class No31 {
    //    我首先想到的事暴力循环比较，第二个方法是使用map集合统计各个数字。
    private int[] num = {2,3,1,5,2,5,3};

    public void sort() {
        for (int i = 0; i < num.length; i++) {
            while (num[num[i]]!=num[i]) {
                exchange(i,num[i]);
                System.out.println(Arrays.toString(num));
            }
        }
    }

    public void exchange(int index, int value) {
        int temp = num[value];
        num[value] = value;
        num[index] = temp;
    }

    public static void main(String[] args) {
        No31 no3=new No31();
        no3.sort();
    }



}
