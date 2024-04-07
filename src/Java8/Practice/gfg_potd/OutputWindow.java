package Practice.gfg_potd;

public class OutputWindow {

    public static int maxProfit(int n, int[] price) {
        // code here

        int sum = 0;
        int currSum = 0;
        int buy = 0;
        int sell = 0;

        for (int i = 0; i < n - 1; i++) {
            if (price[i] < price[i + 1]) {
                buy = price[i];
            } else if (price[i] > price[i + 1] && (buy != 0)) {
                currSum += price[i] - buy;
                sell = price[i];
            }
        }

        return currSum;
    }

    public static void main(String[] args) {
        System.out.println(maxProfit(6, new int[]{10, 22, 5, 75, 65, 80}));
    }
}
