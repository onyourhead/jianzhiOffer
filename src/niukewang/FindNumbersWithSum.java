package niukewang;

import java.util.ArrayList;

/**
 * title: FindNumbersWithSum
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/7
 * time： 17:08
 */
public class FindNumbersWithSum {
    public static void main(String[] args) {
        int[] nums={1,2,4,7,11,15};
        FindNumbersWithSum ex=new FindNumbersWithSum();
        ex.solution(nums,15);
    }
    public ArrayList<Integer> solution(int [] array, int sum) {
        int left=0;
        int right=array.length-1;
        ArrayList<Integer> resultList=new ArrayList<>();
        while (left<=right) {
            if (array[left]+array[right]<sum) {
                left++;
            }
            else if (array[left]+array[right]>sum) {
                right--;
            }
            else {
                resultList.add(array[left]);
                resultList.add(array[right]);
                break;
            }
        }
        return resultList;


    }
}
