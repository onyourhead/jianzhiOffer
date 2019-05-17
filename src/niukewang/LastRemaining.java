package niukewang;

import java.util.ArrayList;

/**
 * title: LastRemaining
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/8
 * time： 17:25
 */
public class LastRemaining {
    public int solution(int n,int m) {
        if (n==0 || m==0)
            return -1;
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(i);
        }
        int startIndex=0;
        while (list.size()!=1) {
            startIndex=(startIndex+m%(list.size())+list.size()-1)%list.size();
            list.remove(startIndex);
        }
        return list.get(0);
    }
}
