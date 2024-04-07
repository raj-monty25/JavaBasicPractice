import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MissingNumberInArray {

        static int missingNumber(int array[], int n) {
            // Your Code Here

            if(n == 0) {
                return 0;
            }

            ArrayList<Integer> list = new ArrayList<>();
            for(int i : array) {
                list.add(i);
            }

            int sumOfNumbers = list.stream().mapToInt(Integer::intValue).sum();
            int actualSum = IntStream.rangeClosed(1, n).sum();
            return actualSum - sumOfNumbers;




           /* List<?> l =  new ArrayList<>();
            l = Arrays.asList(array);
            //l = Arrays.stream(array).boxed().collect(Collectors.toList());
            res = l.stream().filter(i -> i == n)

            for (int i = 1; i <= n; i++) {
                if(!l.contains(i)) {
                    res = i;
                    break;
                }
            }*/
           // return res.getAsInt();
        }

    static int isCircle(int N, String A[])
    {
        // code here
        int result=0;
        for(String s : A) {
            for(int i =1; i< N; i++) {
                if(s.charAt(s.length()-1)== A[i].charAt(0)) {
                    result = 1;
                } else {
                    result = 0;

                }
            }
        }

        return result;
    }

        public static void main(String[] args) {

            /*int[] arr = {1,2,3,5};
            System.out.println(MissingNumberInArray.missingNumber(arr, 5));
            String s = "ishitaa";
            String[] str = s.split(".");
            StringBuilder sb = new StringBuilder(s.split(".").toString());
            sb.reverse().toString();
            s.toLowerCase().length();
            char[] a = s.toCharArray();
            System.out.println(a);
            Arrays.sort(a);
            System.out.println(a);
*/
            /*String a1 = "aabaa";
            String b1 = "baaaaa";
            if(a1.toLowerCase().length() == b1.toLowerCase().length()) {
                char[] aStr = a1.toCharArray();
                char[] bStr = b1.toCharArray();

                Arrays.sort(aStr);
                Arrays.sort(bStr);

                System.out.println(aStr);
                System.out.println(bStr);

                System.out.println( "strings are equal? : " + Arrays.equals(aStr, bStr));
            }*/

            String[] s = {"aa", "bb"};
            System.out.println(MissingNumberInArray.isCircle(2, s));



        }
    }

