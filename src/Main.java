import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));

        System.out.println(nums);
        System.out.println(strings);

        System.out.println("task1(oddNums) = ");
        for (Integer num : nums) {
            task1(num);
        }

    }
    private static void task1(int number) {
        if (number % 2 == 1) {
            System.out.print(number + " ");
        }
    }
}