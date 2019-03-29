package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/29
 * Time: 8:43
 * Progect: jianzhiOffer
 */
public class MinNumberInRotateArray {
    public int solution(int [] array) {
        int i=0,j=array.length-1;
        while (i+1<j) {
            int mid=(i+j)/2;
            if (array[i]>array[j]) {
                if (array[mid]>array[i])
                    i=mid;
                else
                    j=mid;
            }
        }
        return array[j];

    }

    public static void main(String[] args) {
        int[] num={3,4,5,1,2};
        MinNumberInRotateArray mn=new MinNumberInRotateArray();
        mn.solution(num);
    }
}
