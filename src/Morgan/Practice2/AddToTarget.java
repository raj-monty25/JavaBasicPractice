package Morgan.Practice2;

import java.util.*;
import java.util.stream.Stream;

/**
 * Find out the two elements from the given array which adds up to the target value
 */
public class AddToTarget {

    public static List<Integer> findElements(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();

        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (indexMap.containsKey(target - arr[i])) {
                result.add(indexMap.get(target - arr[i]));
                result.add(i);
            }
            indexMap.put(arr[i], i);
        }

        return result;
    }

    public static List<Integer> twoPointer(int[] arr, int target) {
        List<Integer> result = new ArrayList<>();

        int right = 0;
        int left = arr.length - 1;


        while (right < left) {
            int sum = right + left;
            if (sum == target) {
                result.add(right);
                result.add(left);
                return result;
            } else if (sum < target) {
                right ++;
            } else {
                left --;
            }
        }


        return result;
    }

    public static int[] getTargetElement(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i<arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                return new int[] {i, map.get(target - arr[i])
                };
            }
            map.put(arr[i], i);
        }

        return null;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1,2,1,2};
        List<Integer> result = AddToTarget.findElements(arr, 4);
        List<Integer> result2 = AddToTarget.twoPointer(arr, 4);

        Stream.of(result2).forEach(System.out::println);
        Stream.of(result).forEach(System.out::println);

        Arrays.stream(AddToTarget.getTargetElement(arr, 4)).forEach(System.out::println);
    }
}
