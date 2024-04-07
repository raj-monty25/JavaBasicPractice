public class GFG1 {

    static boolean foo(char ch) {
        System.out.println(ch);
        return true;
    }

    public static void main(String[] args) {

        /*int i = 0;

        for (foo('A'); foo('B') && (i < 2); foo('C')) {
            i++;
            foo('D');*/

        float f1[ ], f2[];

        f1 = new float[10];
        f2 = f1;
        System.out.println(f2[0] + " " + f1[0]);
    }

}
