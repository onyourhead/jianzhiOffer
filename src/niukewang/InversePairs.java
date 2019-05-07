package niukewang;

/**
 * title: InversePairs
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/6
 * time： 8:56
 */
public class InversePairs {
    public static void main(String[] args) {
        int[] nums={7,5,6,4};
        InversePairs inversePairs=new InversePairs();
        inversePairs.solution(nums);
    }
    public int solution(int[] array) {
        if (array.length<=0)
            return 0;
        return divide(array,0,array.length-1)%1000000007;
    }
    public int divide(int[] array,int start,int end) {
        if (start==end)
            return 0;
        int mid=start+(end-start)/2;
        int left=divide(array,start,mid);
        int right=divide(array,mid+1,end);
        int count=0;
        int i=mid;
        int j=end;
        int[] copy=new int[array.length];
        int index=end;
        while (i>=start && j>=mid+1) {
            if (array[i]>array[j]) {
                copy[index--]=array[i];
                count+=j-mid;
                i--;
            }
            else {
                copy[index--]=array[j];
                j--;
            }
        }
        for (;i>=start;i--) {
            copy[index--]=array[i];
        }
        for (;j>=mid+1;j--) {
            copy[index--]=array[j];
        }
        for (int k = start; k <= end; k++) {
            array[k]=copy[k];
        }
        copy=null;
        return left+right+count;
    }
}
