package YourOrderPlease;

import java.util.Arrays;
import java.util.Comparator;

/*
Your task is to sort a given string. Each word in the string will contain a single number. This number is the position the word should have in the result.

Note: Numbers can be from 1 to 9. So 1 will be the first word (not 0).

If the input string is empty, return an empty string. The words in the input String will only contain valid consecutive numbers.
 */

public class Order {
    public static String order(String words) {
        String[] array = words.split(" ");
        Arrays.sort(array, Comparator.comparingInt(Order::findIntInString));
        return Arrays.stream(array).reduce("", (acc, s) -> acc = acc + " " + s).trim();
    }

    private static int findIntInString(String s) {
        return Integer.valueOf(s.replaceAll("[^0-9]", ""));
    }
}
