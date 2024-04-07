package Practice.gfg_potd;

public class PossiblePath {

    public static int isPossible(int[][] paths)
    {
        // Code here
        int n = paths.length;
        for (int i = 0;  i < n; i++) {
            int degree = 0;
            for (int j = 0; j < n; j++) {
                degree += paths[i][j];
            }
            if (degree % 2 != 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {

    }
}
