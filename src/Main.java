import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 12, 2, 3, 34, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));

        System.out.println(nums);
        System.out.println(strings);

        System.out.println("task1(oddNums) = ");
        for (Integer num : nums) {
            task1(num);
        }
        System.out.println();
        System.out.println("task2(uniqNums) = ");
        task2(nums);
        System.out.println("task3(uniqStrings) = ");
        task3(strings);
        System.out.println("task4(countDuplicateStrings) = ");
        task4(strings);

    }

    private static void task1(int number) {
        if (number % 2 == 1) {
            System.out.print(number + " ");
        }
    }

    private static void task2(List<Integer> nums) {
        TreeSet<Integer> numsTreeSet= new TreeSet<>(nums);
        for (Integer i : numsTreeSet) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    private static void task3(List<String> strings) {
        System.out.println(new HashSet<>(strings));
    }

    private static void task4(List<String> strings) {
        HashSet<String> uniqStrings = new HashSet<>(strings);
        int count;
        for (String uniqString : uniqStrings) {
            count = 0;
            for (String string : strings) {
                if (uniqString.equals(string)) {
                    ++count;
                }
            }
            System.out.println("uniqString " + uniqString + ": count " + count);
        }
    }
}
