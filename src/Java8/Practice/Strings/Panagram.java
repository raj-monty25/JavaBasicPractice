package Practice.Strings;

import java.util.HashSet;

public class Panagram {
    //Function to check if a string is Pangram or not.
    public static boolean checkPangram  (String s) {
        // your code here
        /*boolean[] str = new boolean[26];
        int index = 0;*/

        HashSet<Character> set = new HashSet<>();
        for (char ch : s.toLowerCase().toCharArray()) {
            if (ch >= 97 && ch <= 122) {
                set.add(ch);
            }
        }

       /* int count = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == true) {
                count++;
            }
        }*/

        if (set.size() == 26) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPangram("Bawds jog, flick quartz, vex nymph"));
    }
}
