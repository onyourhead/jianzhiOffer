package niukewang;

import java.util.ArrayList;

/**
 * title: Match
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/9
 * time： 9:49
 */
public class Match {
    public static void main(String[] args) {
        char[] str={'a'};
        char[] pattern={'.','*'};
        Match ex=new Match();
        System.out.println(ex.solution(str,pattern));
    }
    public boolean solution(char[] str, char[] pattern) {
        ArrayList<Character> strList=new ArrayList<>();
        ArrayList<Character> patternList=new ArrayList<>();
        for (char c:str) {
            strList.add(c);
        }
        for (char c:pattern) {
            patternList.add(c);
        }
        return isMatch(strList,patternList);
    }

    private boolean isMatch(ArrayList<Character> strList, ArrayList<Character> patternList) {
        if (strList.size()==0) {
            if (patternList.size() == 2 && patternList.get(1) == '*')
                return true;
            else return patternList.size() == 0;
        }
        if (patternList.size() == 0) {
            return false;
        }
        if (patternList.size()>=2 && patternList.get(1)=='*') {
            if (strList.get(0)!=patternList.get(0)) {
                if (patternList.get(0)=='.') {
                    patternList.set(0,strList.get(0));
                    isMatch(strList,patternList);
                }
                patternList.remove(1);
                patternList.remove(0);
                return isMatch(strList,patternList);
            } else {
                strList.remove(0);
                return isMatch(strList,patternList);
            }
        } else {
            if (strList.get(0) == patternList.get(0) || patternList.get(0)=='.') {
                strList.remove(0);
                patternList.remove(0);
                return isMatch(strList,patternList);
            } else {
                return false;
            }
        }
    }
}
