package Morgan.Practice2;

import java.util.Arrays;

public class SmallestMissingNumber {

    public static int find(int[] nums) {
        Arrays.sort(nums);

        int smallestNo = 1;

        for (int n : nums) {
            if (n == smallestNo) {
                smallestNo++;
            } else if (n > smallestNo) {
                return smallestNo;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(find(new int[] {0,1,2,3,4,5,6,7,8,9,10,11}));
    }
}
