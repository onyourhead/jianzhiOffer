package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/30
 * Time: 14:20
 * Progect: jianzhiOffer
 */
public class ReOrderArray {
    public void solution(int array[]) {
//        冒泡往前挪
//        先找到第一个偶数
        int firstEvenIndex=0;
        while (firstEvenIndex<array.length && array[firstEvenIndex]%2==1) {
            firstEvenIndex++;
        }
        if (firstEvenIndex==array.length)
            return;
        for (int i = firstEvenIndex+1; i < array.length; i++) {
            if (array[i]%2==1) {
                bullble(array,firstEvenIndex,i);
                firstEvenIndex++;
            }
        }
    }
    public void bullble(int[] array,int m,int n) {
        int temp=array[n];
        for (int i = n; i > m; i--) {
            array[i]=array[i-1];
        }
        array[m]=temp;
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,7};
        ReOrderArray reOrderArray=new ReOrderArray();
        reOrderArray.solution(nums);
    }
}
