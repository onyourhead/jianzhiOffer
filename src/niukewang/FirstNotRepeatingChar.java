package niukewang;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * title: FirstNotRepeatingChar
 * projectName： jianzhiOffer
 * author： 张政淇
 * date： 2019/5/5
 * time： 10:14
 */
public class FirstNotRepeatingChar {
    public int solution(String str) {
        char[] chars=str.toCharArray();
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for (char c: chars) {
            if (map.containsKey(c)) {
                Integer count=map.get(c);
                map.put(c,count+1);
            }
            else
                map.put(c,1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1)
                return str.indexOf(entry.getKey().toString());
        }
        return -1;
    }
}
