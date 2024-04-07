public class FullDiamondPattern {


    /**
     * print below pattern
     * *
     * * *
     * * * *
     * * *
     * *
     */

    public  void star(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {

                System.out.print(" ");

            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i=n;i>=1;i--){
            for(int j = n -i; j>1; j--){

                System.out .print(" ");
            }

            for (int j = i;j>1;j--){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
        public static void main(String[] args) {

            FullDiamondPattern h = new FullDiamondPattern();
            h.star(4);

        }

    }






