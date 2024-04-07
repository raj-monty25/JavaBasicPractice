package Morgan.Practice;

public class RotationString {

    /*
    code to check the rotation of string, if the first string is rotation of second one.
     */
    public static boolean checkRotation(String str1, String str2) {
        if(str2.length() != str2.length()) {
            return false;
        }
        String concatenation = str1 + str1;

        return concatenation.contains(str2);
    }

    public static void main(String[] args) {
        System.out.println(RotationString.checkRotation("String", "ngStri"));
    }
}
