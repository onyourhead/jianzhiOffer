import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/18
 * Time: 19:28
 * Progect: jianzhiOffer
 */
public class KuaiPai {
    public void quickSort(int[] nums,int start,int end) {
        if (start>=end)
            return;
        int index=partion(nums,start,end);
        quickSort(nums,start,index-1);
        quickSort(nums,index+1,end);

    }
    public int partion(int[] nums,int start,int end) {
        int temp=nums[start];
        while (start<end) {
            while (end>=0 && nums[end]>=temp)
                end--;
            if (start<end) {
                swap(nums,start,end);
                start++;
            }
            while (start<nums.length-1 &&nums[start]<=temp)
                start++;
            if (start<end) {
                swap(nums,start,end );
                end--;
            }
        }
        return start;
    }
    public void swap(int[] nums,int a,int b) {
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }
    public static void main(String[] args) {
        int[] nums = {5, 9, 7, 3, 2, 4};
        KuaiPai kuaiPai=new KuaiPai();
        kuaiPai.quickSort(nums,0,nums.length-1);
        System.out.println(Arrays.toString(nums));

    }
}
