package Other;

import java.util.ArrayList;
import java.util.List;

public class mStream {

    public static void main(String[] args) {
        /**
         2
         4
         6
         8
         10
         12
         36 */
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(null);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(null);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);
        System.out.println(nums.stream()
                .filter(num -> num != null)
                .distinct()
                .mapToInt(num -> num * 2)
                // 该方法主要用于调试，方便debug查看Stream内进行处理的每个元素
                .peek(System.out::println)
                .skip(2)
                .limit(4)
                // 累加
                .reduce((s1, s2) -> s1 + s2)
                // 返回对象，没有返回参数值
                .orElse(0));
    }

}
