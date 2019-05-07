package niukewang;

import java.util.ArrayList;

/**
 * title: FindContinuousSequence
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/7
 * time： 14:13
 */
public class FindContinuousSequence {
    public static void main(String[] args) {
        FindContinuousSequence ex=new FindContinuousSequence();
        ex.solution(100);
    }
    public ArrayList<ArrayList<Integer>> solution(int sum) {
        ArrayList<ArrayList<Integer>> resultList=new ArrayList<>();
        int left=1;
        int right=2;
        int curSum=left+right;
        while ( right<sum) {
            if (curSum<sum) {
                right++;
                curSum+=right;
            }
            else if (curSum>sum) {
                curSum-=left;
                left++;
            }
            else {
                ArrayList<Integer> list=new ArrayList<>();
                Integer index=left;
                while (index<=right) {
                    list.add(index);
                    index++;
                }
                resultList.add(list);
                right++;
                curSum+=right;

            }
        }
        return resultList;

    }
}
