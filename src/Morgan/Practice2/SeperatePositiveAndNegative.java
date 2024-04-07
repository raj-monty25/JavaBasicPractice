package Morgan.Practice2;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * seperate the postive elements at one side and negative elements at other
 * I am using two pointer approach
 */
public class SeperatePositiveAndNegative {

    public static void seperate(int[] nums) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            //moving pointer to first positive element
            while (left <= right && nums[left] >= 0) {
                left++;
            }
            //moving pointer to the first negative element
            while (left < right && nums[right] < 0) {
                right --;
            }

            //now swap the element
            if (left <= right) {
                swap(nums, left, right);
                left++;
                right--;
            }
        }
    }

    public static void swap( int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void main(String[] args) {
       /* int[] arr =new int[]{1,-2,3,4,0,-3,-1,-9,-4,8};
        System.out.println(Arrays.toString(arr));
        seperate(arr);
        System.out.println(Arrays.toString(arr));*/

        /*float x = 100;
        System.out.println(x);

        byte b = 127;
        System.out.println((int)(b+1));

        Character ch ='a';
        System.out.println(ch+1);

        Integer value = 9;*/
        utility(2, 19);
    }
    public static void utility(int d, int n){
        //write your code here
        int num = 0;


        num = n % 7;
        int day = d - num;


        if (day > 0) {
            System.out.println(day);
        } else {
            day = 7 - Math.abs(day);
            System.out.println(day);
        }

        int a = 3;
        a = +3;
        System.out.println(-2);
        System.out.println(-0 ^ 1);
        if((5 & 1) != 0){
            System.out.println("odd");
        }
        System.out.println(null == null);
        System.out.println(a);
        System.out.println((a++) + " " + (a--));
        System.out.println((5^2^5)^2);

        int x = 1000000;
        System.out.println(x * (x+1) / 2);


    }
}
