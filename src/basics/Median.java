import java.util.Arrays;

public class Median {
        public static int find_median(int[] v)
        {
            // Code here
            Arrays.sort(v);
            int len = v.length;
            if (len == 2) {
                return (v[0] + v[1]) / 2;
            } else if (len % 2 == 0) {
                int midInd1 = (len/2 - 1);
                int midInd = len/2;
                return v[midInd1] + v[midInd] / 2;
            } else {
                int midIndex = len / 2;
                return v[midIndex];
            }
        }

    public static void main(String[] args) {
        System.out.println(find_median(new int[] {11, 19}));
    }
    }

