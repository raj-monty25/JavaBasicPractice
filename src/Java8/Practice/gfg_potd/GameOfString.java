package Practice.gfg_potd;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class GameOfString {

    static int minValue(String s, int k) {
        // code here

        Map<Character, Integer> frequencyMap = new HashMap<>();

        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        maxHeap.addAll(frequencyMap.values());

        while (k > 0 && !maxHeap.isEmpty()) {
            int frequency = maxHeap.poll();

            if (frequency > 1) {
                maxHeap.offer(frequency - 1);
            }

            k--;
        }

        int sumOfSquares = 0;

        while (!maxHeap.isEmpty()) {
            int frequency = maxHeap.poll();
            sumOfSquares += frequency * frequency;
        }

        return sumOfSquares;

    }

    public static void main(String[] args) {
        System.out.println(minValue("abccc", 1));
    }
}