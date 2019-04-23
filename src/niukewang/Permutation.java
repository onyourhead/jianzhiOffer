package niukewang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/4/16
 * Time: 17:18
 * Progect: jianzhiOffer
 */
public class Permutation {
    ArrayList<String> resultList=new ArrayList<>();
    public ArrayList<String> solution(String str) {
//        用递归做应该不难，就是不太高明
        if (str==null || str.length()==0)
            return resultList;
        char[] chars=str.toCharArray();
        permutation(chars,0);
        Collections.sort(resultList);
        return resultList;
    }

    private void permutation(char[] chars, int i) {
        if (i==chars.length-1) {
            resultList.add(new String(chars));
            return;
        }
        HashSet<Character> set=new HashSet<>();
        for (int movingIndex=i;movingIndex<chars.length;movingIndex++) {
            if (set.contains(chars[movingIndex]))
                continue;
            set.add(chars[movingIndex]);
            swap(chars,i,movingIndex);
            permutation(chars,i+1);
            swap(chars,i,movingIndex);
        }

    }

    public void swap(char[] chars,int begin,int end) {
        char temp=chars[begin];
        chars[begin]=chars[end];
        chars[end]=temp;
    }

    public static void main(String[] args) {

        Permutation permutation=new Permutation();
        permutation.solution("abbc");
    }
}
