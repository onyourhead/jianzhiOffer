package niukewang;
import java.util.Stack;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/29
 * Time: 8:31
 * Progect: jianzhiOffer
 */
public class TwoStackOneQueue {

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}