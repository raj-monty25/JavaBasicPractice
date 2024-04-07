package Morgan.Practice2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Find the pair/s which gives the sum equal to x
 * time complexity = O(n)
 * space complexity = O(1)
 */
public class PairSum {

    public static List<List<Integer>> findPair(int[] arr, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        HashSet<Integer> complementSet = new HashSet<>();

        for (int n : arr) {
            int comp = sum - n;
            if (complementSet.contains(comp)) {
                ArrayList<Integer> value = new ArrayList<>();
                value.add(n);
                value.add(comp);
                result.add(value);
            }
            complementSet.add(n);
        }

        return result;
    }

    /**
     * this is two pointer approach (for this approach the array should be shorted)
     * time complexity is O(n log n)
     * space complexity os O(1)
     * @param arr
     * @param sum
     * @return
     */
    public static List<List<Integer>> twoPointer(int[] arr, int sum) {
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if ((arr[left] + arr[right]) == sum) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(arr[left]);
                list.add(arr[right]);
                result.add(list);
                left++;
                right--;
            } else if ((arr[left] + arr[right]) < sum ) {
                left++;
            } else {
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("using hashset approach");
       PairSum.findPair(new int[]{1, 2, 3, 4, 5, 6, 7, 9}, 9).stream()
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println("Using two pointer method");
        PairSum.twoPointer(new int[]{1, 2, 3, 4, 5, 6, 7, 9}, 9).stream()
                .collect(Collectors.toList()).forEach(System.out::println);

    }

}
