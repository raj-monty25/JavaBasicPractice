package Morgan.Practice;

import java.util.HashMap;
import java.util.Map;

public class NoRepeatedChar {

    public static char printChar(String str) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : str.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        for (char c :str.toCharArray()) {
            if (freq.get(c) == 1)
                return c;
        }
        return '-';
    }

    public static void main(String[] args) {
       char c = NoRepeatedChar.printChar("aeeelloiiin");
        System.out.println(c);
    }
}
