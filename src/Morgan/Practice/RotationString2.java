package Morgan.Practice;

public class RotationString2 {
    /*
    code to check string rotation without predefined method
    time complexity is O(n^2)
    space complexity is O(n)
     */
    public static boolean checkRotation (String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        String concatenated= str1 + str1;
        return concatenated.indexOf(str2) != -1;
    }

    /**
    checking using string equals method
     time complexity is O(n)
     space complexity is O(n)
     */
    public static boolean checkWithEquals(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;
        String concatenated= str1 + str1;
        System.out.println(str2+str2);
        return concatenated.equals(str2 + str2);
    }

    /**
     * checking if a 2nd string is rotation of 1st one
     * time complexity is O(n^2)
     * space complexity is O(n)
     *
     * @param str1
     * @param str2
     * @return true or false
     */
    public static boolean checkWithStringBuilder(String str1, String str2) {
        if(str1.length() != str2.length())
            return false;

        for (int i = 0; i < str1.length(); i++) {
            StringBuilder rotated = new StringBuilder();
            rotated.append(str1.substring(i)).append(str1.substring(0, i));
            if (rotated.toString().equals(str2))
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        /*System.out.println(RotationString2.checkRotation("String", "ngStri")); */
        /*System.out.println(RotationString2.checkWithStringBuilder ("String", "ngStri"));*/
        System.out.println(RotationString2.checkWithEquals("String", "ngStri"));
    }
}
