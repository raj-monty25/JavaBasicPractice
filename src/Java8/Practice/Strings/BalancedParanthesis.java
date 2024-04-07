package Practice.Strings;

import java.util.Stack;

public class BalancedParanthesis {

    static boolean ispar(String x)
    {
        // add your code here
        Stack<Character> st = new Stack<>();

        boolean flag = true;

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                st.push(ch);
            } else {
                if (st.isEmpty()) {
                    flag =  false;
                } else {
                    char chr = st.pop();
                    System.out.println(ch);
                    System.out.println(chr);
                    if ((chr == '(' && ch == ')') || (chr == '[' && ch == ']')
                            || (chr == '{' && ch == '}')) {
                        flag = true;
                    } else  {
                        flag = false;
                        break;
                    }
                }
            }
        }

        if (!st.isEmpty()) {
            flag = false;
        }
        return flag;
    }

    public static void main(String[] args) {
        boolean res =  ispar("[({[([{}])]})}");

        if (res)
            System.out.println("balanced");
        else
            System.out.println("not balanced");
    }
}
