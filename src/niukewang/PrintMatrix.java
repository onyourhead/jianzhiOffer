package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/9
 * Time: 17:59
 * Progect: jianzhiOffer
 */

import java.util.ArrayList;
import java.util.List;

public class PrintMatrix {
    public static ArrayList<Integer> solution(int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        if (matrix.length == 0 || matrix[0].length == 0)
            return list;
        int left = 0, right = matrix[0].length - 1;
        int top = 0, btm = matrix.length - 1;
        while (left <= right && top <= btm) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            if (top < btm) {
                for (int i = top + 1; i <= btm; i++) {
                    list.add(matrix[i][right]);
                }
            }
            if (top < btm && left < right) {
                for (int i = right - 1; i >= left; i--) {
                    list.add(matrix[btm][i]);
                }
            }
            if (top + 1 < btm && left < right) {
                for (int i = btm - 1; i > top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            ++left;
            --right;
            ++top;
            --btm;
        }
        return list;
    }

    public static void main(String[] args) {
//        int[][] matrix = {
//                {1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}
//        };
        int[][] matrix = {
                {1, 2, 3,4,5}
        };
        solution(matrix);

    }
}
