package niukewang;

import java.util.ArrayList;

/**
 * title: MaxInWindows
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/16
 * time： 10:36
 */
public class MaxInWindows {
    public ArrayList<Integer> solution(int[] num, int size) {
        ArrayList<Integer> resultList=new ArrayList<>();
        if (num.length==0 || size==0 || num.length<size) {
            return resultList;
        }
        int maxIndex=0;
        for (int i = 0; i < size; i++) {
            if (num[i]>=num[maxIndex])
                maxIndex=i;
        }
        resultList.add(num[maxIndex]);
        for (int i = size; i < num.length; i++) {
            if (maxIndex<=i-size) {
                maxIndex=i-size+1;
                for (int j = i-size+1; j <= i; j++) {
                    if (num[j]>=num[maxIndex])
                        maxIndex=j;
                }
            } else if (num[i]>=num[maxIndex]) {
                maxIndex = i;
            }
            resultList.add(num[maxIndex]);
        }
        return resultList;
    }
}
