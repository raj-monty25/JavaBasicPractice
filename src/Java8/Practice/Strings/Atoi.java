package Practice.Strings;

public class Atoi {

    /**
     * Given a string, s, the objective is to convert
     * it into integer format without utilizing any built-in functions.
     * If the conversion is not feasible, the function should return -1.
     *
     * Note: Conversion is feasible only if all characters in the string
     * are numeric or if its first character is '-' and rest are numeric.
     * @param s
     * @return
     */
    static int checkAtoi(String s) {
        // Your code here
        boolean flag = false;
        char[] ch = s.toCharArray();

        if (Character.isDigit(ch[0]) || ch[0] == '-') {
            flag = true;
            for (int i = 1; i < ch.length; i++) {
                if (Character.isDigit(ch[i])) {
                    flag = true;
                } else {
                    flag = false;
                    break;
                }
            }
        }



        if(flag) {
            return Integer.parseInt(s);
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(checkAtoi("4"));
    }
}
