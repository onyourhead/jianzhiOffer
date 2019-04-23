/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/18
 * Time: 19:48
 * Progect: jianzhiOffer
 */
public class BinarySearch {
    public int search(int[] nums,int start,int end,int k) {
        if (start>end)
            return -1;
        int middle=(start+end)/2;
        if (k==nums[middle])
            return middle;
        if (k<nums[middle])
            return search(nums,start,middle-1,k);
        else
            return search(nums,middle+1,end,k);
    }
    public static void main(String[] args) {
        int[] nums={1,2,3,4,6,8,10};
        BinarySearch binarySearch=new BinarySearch();
        int index=binarySearch.search(nums,0,nums.length-1,5);
        System.out.println(index);

    }
}
