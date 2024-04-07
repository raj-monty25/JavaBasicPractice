package Morgan.Practice2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * Find 5 minimum elements from given 5 sorted arrays
 * (priority queue or min-heap)
 */
public class FiveMinimumElements {

    public static List<Integer> findFiveMinimumElement(int[][] arr) {
        List<Integer> list = new ArrayList<>();

        PriorityQueue<Nodee> queue = new PriorityQueue<>(Comparator.comparingInt(i -> i.value));

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i].length > 0) {
                queue.offer(new Nodee(i, 0, arr[i][0]));
            }
        }

        while (list.size() < 5 && !queue.isEmpty()) {
            Nodee node = queue.poll();
            list.add(node.value);

            int nextIndex = node.index + 1;
            if(nextIndex < arr[node.arrayIndex].length) {
                queue.offer(new Nodee(node.arrayIndex, nextIndex, arr[node.arrayIndex][nextIndex]));
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int[][] sortedArrays = {
                {1, 5, 10, 15, 20},
                {2, 6, 11, 16, 21},
                {3, 7, 12, 17, 22},
                {4, 8, 13, 18, 23},
                {9, 14, 19, 24, 25}
        };

        List<Integer> minElements = findFiveMinimumElement(sortedArrays);
        System.out.println("Five minimum elements:");
        for (int num : minElements) {
            System.out.print(num + " ");
        }
    }
}
