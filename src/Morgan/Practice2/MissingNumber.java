package Morgan.Practice2;

public class MissingNumber {
    public static int findMissingNumber(int[] numbers, int range) {
        //it is a problem of Arith Progression

        //int range2 = range + 1;
        int expectedSum =  (range * (range+1)) / 2 ;
        System.out.println(expectedSum);
        int actualSum = 0;
        for (int n : numbers) {
            actualSum = actualSum + n;
        }
        System.out.println(actualSum);
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        System.out.println(findMissingNumber(new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,20}, 20));
    }
}
