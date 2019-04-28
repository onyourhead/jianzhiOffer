package niukewang;

public class MoreThanHalfNum {
    public int solution(int [] array) {
        int curnum=array[0];
        int time=1;
        for (int i = 1; i < array.length; i++) {
            if (time==0) {
                curnum=array[i];
                time++;
            }
            else if (array[i]==curnum)
                time++;
            else time--;

        }
        time=0;
        for (int num:array) {
            if (num==curnum)
                time++;
        }
        return time>array.length/2?curnum:0;
    }
    public static void main(String[] args) {

    }
}
