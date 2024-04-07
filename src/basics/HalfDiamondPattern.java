public class HalfDiamondPattern {

    /** print below pattern
     *   *
     *   **
     *   ***
     *   **
     *   *
     */
    public void star(int n) {
        for(int i = 0; i<n; i++) {

            for(int j = 0; j<=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        for (int i = n; i>0; i--) {

            for (int j = 1; j<i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

    public static void main(String[] args) {

        HalfDiamondPattern h = new HalfDiamondPattern();
        h.star(20);
    }


}



