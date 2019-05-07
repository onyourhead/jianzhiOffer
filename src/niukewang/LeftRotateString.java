package niukewang;

import java.util.Arrays;

/**
 * title: LeftRotateString
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/7
 * time： 17:26
 */
public class LeftRotateString {
    public static void main(String[] args) {
        LeftRotateString ex=new LeftRotateString();
        System.out.println(ex.solution("abcdef",3));
    }
    public String solution(String str,int n) {
        if (str.equals(""))
            return "";
        int realN=n%str.length();
        StringBuffer sb=new StringBuffer();
        sb.append(str.substring(realN,str.length()));
        sb.append(str.substring(0,realN));
        return sb.toString();

    }
}
