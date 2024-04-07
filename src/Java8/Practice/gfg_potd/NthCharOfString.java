package Practice.gfg_potd;

public class NthCharOfString {

    public static char nthCharacter(String s, int r, int n)
    {
        //code here
        StringBuilder sb = new StringBuilder(s);

        StringBuilder res = new StringBuilder();

        int j = 0;
        while (j < r) {
            for (int i = 0; i <= n; i++) {
                if (sb.charAt(i) == '1') {
                    res.append("10");
                } else if (sb.charAt(i) == '0') {
                    res.append("01");
                }
            }
            j++;
            sb = res;
            if (j < r){
                res = new StringBuilder("");
            }
        }

        return res.charAt(n);
    }

    public static void main(String[] args) {

        System.out.println(nthCharacter("100001010", 2, 0)); //100001010 2 0
        //"111101", 2, 3
    }
}
