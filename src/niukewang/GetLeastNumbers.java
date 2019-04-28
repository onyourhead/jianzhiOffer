package niukewang;

import java.util.ArrayList;

public class GetLeastNumbers {
    public ArrayList<Integer> solution(int [] input, int k) {
//        利用快排特性，找第length-k大的元素
        ArrayList<Integer> result=new ArrayList<>();
        if (k<1 || k>input.length) {
            return result;
        }
        findKTh(input,k,0,input.length-1);
        for (int i = 0; i < k; i++) {
            result.add(input[i]);
        }
        return result;
    }
    public void findKTh(int[] input,int k,int begin,int end) {
        if (begin>=end)
            return;
        int indexOfFirstElement=findIndex(input,begin,end);
        if (indexOfFirstElement==k)
            ;
        else if (indexOfFirstElement<k)
            findKTh(input,k,indexOfFirstElement+1,end);
        else findKTh(input,k,begin,indexOfFirstElement-1);
    }

    public int findIndex(int[] num,int begin, int end) {
        exchange(num,begin,end);
        int small=begin-1;
        for (int index = begin;index<end;++index) {
            if (num[index]<num[end])
            {
                ++small;
                if (small!=index)
                    exchange(num,index,small);
            }

        }
        ++small;
        exchange(num,small,end);
        return small;
    }
    public void exchange(int[] num,int index1, int index2) {
        int temp = num[index1];
        num[index1] = num[index2];
        num[index2] = temp;
    }

    public static void main(String[] args) {
        int[] nums={4,5,1,6,2,7,3,8};
        GetLeastNumbers getLeastNumbers=new GetLeastNumbers();
        getLeastNumbers.solution(nums,4);
    }
}
