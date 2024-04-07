package Practice.gfg_potd;

import java.util.ArrayList;

public class WordBreak {

    public static int wordBreak(int n, String s, ArrayList<String> dictionary ){
        return memo(0,s,dictionary,new Boolean[s.length()+1])?1:0;
    }

    public static boolean memo(int i,String s,ArrayList<String> dict,Boolean dp[]) {
        if (i == s.length()) return true;
        if (dp[i] != null) return dp[i];
        for (int j = i + 1; j <= s.length(); j++) {
            String sub = s.substring(i, j);
            if (dict.contains(sub) && memo(j, s, dict, dp)) return dp[i] = true;
        }
        return dp[i] = false;
    }

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("i");
        list.add("like");
        list.add("sam");
        list.add("sung");
        list.add("samsung");
        list.add("mobile");
        System.out.println(wordBreak(6, "ilike", list));

    }
}
