import java.util.Arrays;
import java.util.Random;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/1/14
 * Time: 17:09
 * Progect: jianzhiOffer
 */
public class QuickSort {
    private int[] num;

    public QuickSort(int[] num) {
        this.num = num;
    }

    public void sort(int begin, int end) {
        if (begin >= end)
            return;
        int index = findIndex(begin, end);
        sort(begin, index - 1);
        sort(index + 1, end);
    }

    //    public int findIndex(int begin, int end) {
//        while (begin<end) {
//            while (num[end]>num[begin])
//                end--;
//            exchange(begin,end);
//            begin++;
//            while (num[begin]<num[end])
//                begin++;
//            exchange(begin,end);
//            end--;
//        }
//        return begin;
//    }
    public int findIndex(int begin, int end) {
        Random random=new Random();
//        int index=begin+random.nextInt(end-begin);
        int index=begin;
        exchange(index,end);
        int small=begin-1;
        for (index = begin;index<end;++index) {
            if (num[index]<num[end])
            {
                ++small;
                if (small!=index)
                    exchange(index,small);
            }

        }
        ++small;
        exchange(small,end);
        return small;
    }

    public void exchange(int index1, int index2) {
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }

    public static void main(String[] args) {
        int[] num = {5, 9, 7, 3, 2, 4};
        QuickSort quickSort = new QuickSort(num);
        quickSort.sort(0, 5);
        System.out.println(Arrays.toString(num));
    }
}
