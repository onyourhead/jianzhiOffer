package niukewang;

import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/10
 * Time: 15:42
 * Progect: jianzhiOffer
 */
public class IsPopOrder {
    public static boolean solution(int[] pushA, int[] popA) {
        Stack<Integer> stack = new Stack<Integer>();
        int j = 0;
        for (int i = 0; i < popA.length; i++) {
            if (!stack.isEmpty() && stack.peek() == popA[i]) {
                stack.pop();
                continue;
            }
            if (j == pushA.length)
                return false;
            for (; j < pushA.length; j++) {
                if (pushA[j] != popA[i])
                    stack.push(pushA[j]);
                else break;
            }
            if (j == pushA.length)
                return false;
            j++;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
//        int[] b={4,5,3,2,1};
        int[] b = {4, 3, 5, 1, 2};

        solution(a, b);
    }
}
