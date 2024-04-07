package Practice.gfg_potd;

import java.util.Stack;

public class MaxHeap {
    public static boolean countSub(long arr[], long n)
    {
        // Your code goes here
        boolean res = true;

        for (int i = 1; i <n; i++) {

            if (arr[i - 1] < arr[i]) {
                return false;
            }
            if ((2*i+1)<n && arr[i]<arr[2*i+1]) {
                res = false;
            }
            if ((2*i+2)<n && arr[i]<arr[2*i+1]) {
                res = false;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        if (countSub(new long[]{90, 15, 10, 7, 12, 2}, 6)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

        String s = "";
        StringBuilder sb = new StringBuilder(s);
        sb.reverse().toString();
    }

}
