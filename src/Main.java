import javax.swing.*;
import java.util.*;

public class Main {

    private static final List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    private static final List<String> words = new ArrayList<>(List.of("abc", "bca", "abc", "bac", "cba", "akl", "lka", "akl"));

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.println(nums.get(i));
            }

        }

    }

    public static void task2() {
        Collections.sort(nums);
        List<Integer> newNums = new ArrayList<>(Arrays.asList());
        for (int num : nums) {
            if (num % 2 == 0) {
                newNums.add(num);
            }
        }
        Set numbers = new HashSet(newNums);
        System.out.println(numbers);
        }

    public static void task3() {

        Set printWords = new HashSet(words);
        System.out.println(printWords);

    }

    public static void task4() {
        Set<String> printWords = new HashSet(words);
        System.out.println(words.size() - printWords.size());

    }

}

