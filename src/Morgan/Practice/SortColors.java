package Morgan.Practice;

import java.util.Arrays;

public class SortColors {

    public static int[] sort(int[] arr) {
        int count0 = 0, count1 = 0, count2 = 0;
        for (int n : arr) {
            if(n == 0) count0++;
            else if (n == 1) count1++;
            else if (n == 2) count2++;
        }

        int index = 0;
        while (count0-- > 0) arr[index++] = 0;
        while (count1-- > 0) arr[index++] = 1;
        while (count2-- > 0) arr[index++] = 2;

        return arr;
    }

    public static void main(String[] args) {
        int[] a = new int[]{1,0,0,0,0,2,0,1,0,1,2,2,2,2,2};
        Arrays.sort(a);
        //int[] arr = SortColors.sort(new int[]{1,0,0,0,0,2,0,1,0,1,2,2});

        for (int n : a)
            System.out.print(n + " ");

    }
}
