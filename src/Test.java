import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a","1");
        map.put("我","1");
        map.put("c","1");
        map.put("的","1");
        for (Map.Entry<String,String> entry:map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());

        }
    }

    private static void change(int[] nums) {
        nums[nums.length-1] = 99;
    }
}
