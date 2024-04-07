import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.*;

public class SmallestSubArrayWithSum {

        public static int smallestSubWithSum(int a[], int n, int x) {

            int minLen = MAX_VALUE;

            int start = 0;
            int sum = 0;
            int end = 0;

            while (end < n) {
                while (sum <= x && end < n) {
                    sum += a[end++];
                }

                while (sum > x && start < n) {
                    if(end - start < minLen) {
                        minLen = end - start;
                    }

                    sum -= a[start++];
                }
            }
            return minLen == Integer.MAX_VALUE ? 0 : minLen;
        }

    public static void main(String[] args) {
       int n = smallestSubWithSum(new int[] {1, 4, 45, 6, 0, 19},  6,51);
        System.out.println(n);
    }
}
