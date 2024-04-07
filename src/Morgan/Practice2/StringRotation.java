package Morgan.Practice2;

/**
 * Check if two strings are rotation of each other
 * ex: "string" and "ingstr" == true
 */
public class StringRotation {

    public static boolean checkRotation(String str1, String str2) {

        String concat = str1 + str1;

        if (concat.contains(str2)) {
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(checkRotation("string", "iingstr"));
    }
}
