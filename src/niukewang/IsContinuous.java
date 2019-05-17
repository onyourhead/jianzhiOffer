package niukewang;

import java.util.ArrayList;
import java.util.Collections;

/**
 * title: IsContinuous
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/8
 * time： 16:43
 */
public class IsContinuous {
    public boolean solution(int[] numbers) {
//        先排序
        ArrayList<Integer> nums=new ArrayList<>();
        int numOfZero=0;
        for (int num:numbers) {
            if (num==0)
                numOfZero++;
            nums.add(num);
        }
        Collections.sort(nums);
        return nums.get(nums.size() - 1) - nums.get(numOfZero) <= nums.size() - 1;

    }
}
