package Morgan.Practice;

import java.util.Arrays;

// Add one AddOneToArray

public class AddOneToArray {

    public static int[] addOne(int[] arr) {
        for(int i = arr.length - 1; i >=0; i--) {
            arr[i] ++;
            if (arr[i] == 10) {
                arr[i] = 0;
            } else {
                return arr;
            }
        }
        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1; // Set the first element to 1 (carry)
        return newArr;
    }

    public static void main(String[] args) {
        Arrays.stream(AddOneToArray.addOne(new int[] {9, 9, 9, 9})).forEach(System.out::println);
        //Arrays.stream(AddOneToArray.addOne(new int[] {9, 11})).forEach(System.out::println);

    }
}
