package niukewang;

/**
 * Created by IntelliJ IDEA.
 * User: 张政淇
 * Date: 2019/3/28
 * Time: 9:42
 * Progect: jianzhiOffer
 */
public class ReplaceSpace {
    public String solution(StringBuffer str) {
        int indexOfSpace=str.indexOf(" ");
        while (indexOfSpace>=0) {
            str.replace(indexOfSpace,indexOfSpace+1,"%20");
            indexOfSpace=str.indexOf(" ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        ReplaceSpace replaceSpace=new ReplaceSpace();
        StringBuffer sb=new StringBuffer();
        sb.append("We Are Happy");
        replaceSpace.solution(sb);
    }
}
