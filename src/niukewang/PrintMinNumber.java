package niukewang;

import java.util.ArrayList;
import java.util.Comparator;

public class PrintMinNumber {
    public String solution(int [] numbers) {
        ArrayList<String> nums=new ArrayList<>();
        for (int num:numbers)
            nums.add(num+"");
        nums.sort((o1, o2) -> {
            if (Integer.parseInt(o1+o2)>Integer.parseInt(o2+o1))
                return 1;
            else if (Integer.parseInt(o1+o2)<Integer.parseInt(o2+o1))
                return -1;
            else
                return 0;
        });
        StringBuffer sb=new StringBuffer();
        for (String s:nums)
            sb.append(s);
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] nums={3,32,321};
        PrintMinNumber printMinNumber=new PrintMinNumber();
        System.out.println(printMinNumber.solution(nums));
    }
}
