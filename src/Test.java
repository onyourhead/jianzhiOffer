import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> nums = new ArrayList<>();
        nums.add(3+"");
        nums.add(32+"");
        nums.add(321+"");
        nums.sort(((o1, o2) -> {
            if (Integer.parseInt(o1+o2)>Integer.parseInt(o2+o1))
                return 1;
            else if (Integer.parseInt(o1+o2)<Integer.parseInt(o2+o1))
                return -1;
            else
                return 0;
//            if (Integer.parseInt(o1)>Integer.parseInt(o2))
//                return 1;
//            else if (Integer.parseInt(o1)<Integer.parseInt(o2))
//                return -1;
//            else
//                return 0;
        }));
        for (String num : nums)
            System.out.println(num);
//        System.out.println(nums);

    }
}
