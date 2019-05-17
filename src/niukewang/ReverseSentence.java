package niukewang;

/**
 * title: ReverseSentence
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/7
 * time： 17:33
 */
public class ReverseSentence {
    public static void main(String[] args) {
        ReverseSentence ex = new ReverseSentence();
        System.out.println(ex.solution("I am a student."));
    }

    public String solution(String str) {
        if (str.equals(""))
            return "";
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length / 2; i++) {
            String temp = strings[i];
            strings[i] = strings[strings.length - 1 - i];
            strings[strings.length - 1 - i] = temp;
        }
        StringBuffer sb = new StringBuffer();
        for (String s : strings) {
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}
