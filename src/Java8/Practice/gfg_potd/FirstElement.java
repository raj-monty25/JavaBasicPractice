package Practice.gfg_potd;

import java.util.HashMap;
import java.util.Map;

public class FirstElement {

    public static int firstElementKTime(int n, int k, int[] a) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(a[i], map.getOrDefault(a[i],0) + 1);
            if (map.get(a[i]) == k) {
                return a[i];
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 4, 3, 4, 8, 7};
        firstElementKTime(7, 2, arr);

    }
}
