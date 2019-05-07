package niukewang;

/**
 * title: GetNumberOfK
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 11:52
 */
public class GetNumberOfK {
    public int solution(int[] array, int k) {
        int count=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]==k)
                count++;
        }
        return count;
    }
}
