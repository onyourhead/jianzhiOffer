package niukewang;

public class FindGreatestSumOfSubArray {
    public int solution(int[] array) {
        int max=array[0];
        int sum=max;
        for (int i = 1; i < array.length; i++) {
            if (sum+array[i]<0){
                sum=0;
                if (array[i]>max) {
                    max=array[i];
                }
            }
            else {
                sum+=array[i];
                if (max<=sum) {
                    max=sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums={1,-2,3,10,-4,7,2,-5};
        FindGreatestSumOfSubArray findGreatestSumOfSubArray=new FindGreatestSumOfSubArray();
        findGreatestSumOfSubArray.solution(nums);
    }
}
