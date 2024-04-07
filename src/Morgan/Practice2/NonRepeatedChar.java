package Morgan.Practice2;

import Morgan.Practice.NoRepeatedChar;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the first non-repeated character in the string
 */
public class NonRepeatedChar {

    public static char printChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (map.get(c) == 1) {
                return c;
            }
        }
        return '-';
    }

    public static char print2(String str) {

        char[] ch = str.toCharArray();

        for (int i = 0; i < ch.length; i++) {

        }

        return '-';
    }
    public static void main(String[] args) {
        System.out.println(NoRepeatedChar.printChar("aaavvvddi"));
    }
}
