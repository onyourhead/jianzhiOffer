package niukewang;

import java.util.ArrayList;

/**
 * title: MovingCount
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/15
 * time： 20:29
 */
public class MovingCount {
    int count=0;
    public int solution(int threshold, int rows, int cols) {
        int[][] flag=new int[rows][cols];
        run(flag,threshold,0,0);
        return count;
    }
    public void run(int[][] flag,int threshold,int curRows,int curCols) {
        if (curRows<flag.length && curCols<flag[0].length) {
            if (flag[curRows][curCols]==0 && lessThanK(curRows,curCols,threshold)) {
                flag[curRows][curCols]=1;
                count++;
                run(flag,threshold,curRows,curCols+1);
                run(flag,threshold,curRows+1,curCols);
            }
        }
    }
    public boolean lessThanK(int x, int y,int k) {
        ArrayList<Integer> nums=new ArrayList<>();
        while (x>0) {
            nums.add(x%10);
            x=x/10;
        }
        while (y>0) {
            nums.add(y%10);
            y=y/10;
        }
        int sum=0;
        for (Integer i:nums) {
            sum+=i;
        }
        return sum <= k;
    }

    public static void main(String[] args) {
        MovingCount ex=new MovingCount();
        ex.solution(10,5,10);
    }
}
