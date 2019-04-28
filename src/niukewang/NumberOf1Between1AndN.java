package niukewang;

public class NumberOf1Between1AndN {
    int count=0;
    public int solution(int n) {
        for (int i = 1; i <= n; i++) {
            numOf1(i);
        }
        return count;
    }
    public void numOf1(int n) {
        while (n!=0) {
            int extra=n%10;
            n=n/10;
            if (extra==1)
                count++;
        }
    }
}
