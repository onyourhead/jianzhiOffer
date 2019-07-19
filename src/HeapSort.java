import niukewang.JumpFloor;
import org.junit.Test;

import java.util.Arrays;


/**
 * @ClassName: HeapSort
 * @Description: 大顶堆可以得到升序结果，小顶堆可以得到降序结果
 * @Author: zhangzhengqi
 * @DateTime: 2019/7/19 15:01
 * @Version: 1.0
 */
public class HeapSort {
    @Test
    public void main() {
        int[] nums = {4, 6, 5, 8, 5, 9};
        buildSmallHeap(nums);
        System.out.println(Arrays.toString(nums));

    }

    public void buildSmallHeap(int[] nums) {
        for (int i = (nums.length - 2) / 2; i >= 0; i--) {
            ajustSmallHeap(nums, i, nums.length);
        }

        for (int i = nums.length - 1; i > 0; i--) {
            swap(nums, 0, i);
            ajustSmallHeap(nums, 0, i);
        }
    }

    private void swap(int[] nums, int i1, int i2) {
        int temp = nums[i1];
        nums[i1] = nums[i2];
        nums[i2] = temp;
    }


    /**
     * @param nums   待排序数组
     * @param i      待调整元素
     * @param length 限制调整范围为小于length的元素集合，因为在将根节点交换到底部后，底部是已有序集合，应该断开与待排序集合的联系
     * @return 无
     * @description 调整大顶堆，将给定元素下沉到正确位置
     **/
    private void ajustSmallHeap(int[] nums, int i, int length) {
        for (int j = 2 * i + 1; j < length; j = 2 * j + 1) {
            if (j + 1 < length && nums[j] < nums[j + 1]) {
                j++;
            }
            if (nums[i] < nums[j]) {
                swap(nums, i, j);
                i = j;
            } else
                break;

        }
    }
}
