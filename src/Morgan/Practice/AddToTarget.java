package Morgan.Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class AddToTarget {

    /**
     * this is using hashmap technique
     * time complexity is O(n) as it is iterating over the array for each element one time with get and put operations
     * @param arr
     * @param target
     * @return
     */
    public int[] getTargetIndexes(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i<arr.length; i++) {
            if(map.containsKey(target - arr[i])) {
                result[1] = i;
                result[0] = map.get(target - arr[i]);
            }
            map.put(arr[i], i);
        }
        return result;
    }

    /*
    this two pointer approach (for this approach the array must be sorted)
    time complexity is O(n log n)
    space complexity is O(1)
     */
    public int[] getTargetIndexes2(int[] arr, int target) {
        // No need to sort the array as we need to find the position of sum of numbers
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length -1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                return new int[] {left, right};
            } else
                if (sum < target) {
                left++;
            } else {
                right --;
            }
        }
        return null;
    }

    public int[] getTargetUsingJava8(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        return IntStream.range(0,arr.length).filter(i -> map.containsKey(target - arr[i]) && map.get(target - arr[i]) != i).
                mapToObj(i -> new int[]{arr[i], map.get(target - arr[i])}).findFirst().orElse(null);
    }

    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(s - arr[i])) {
                list.add(i+1);
                list.add(map.get(s-arr[i]) + 1);
            }
            map.put(arr[i], i);
        }

        if (list.isEmpty()) {
            list.add(-1);
        }

        return list;

    }
        public static void main(String[] args) {

            System.out.println(subarraySum(new int[] {1,2,3,7,5},5 ,12));






       /* AddToTarget addToTarget = new AddToTarget();
        int[] arr = {1, 2, 2, 1}; // 1, 2 target : 4
        int[] arr1 = {2,3,4,1,6,1}; // 2, 4 target : 10
        int[] arr2 = {2,6,3,1,3,3}; // 1, 5 target : 9
            //Arrays.stream(addToTarget.getTargetIndexes2(arr1, 9)).forEach(System.out::println);
            Arrays.stream(addToTarget.getTargetIndexes2(arr1, 10)).forEach(System.out::println);
            Arrays.stream(addToTarget.getTargetUsingJava8(arr1, 10)).forEach(System.out::println);*/
    }
}
