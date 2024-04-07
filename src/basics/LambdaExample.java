import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExample {

    //list of students
    //print names in alphabetical ordeer

    /*public List<String> printName(List<Student> st) {

        List<String> list = new ArrayList<>();

        list = st.stream().filter(s -> s.g ).collect(Collectors.toList());



        return list;

    }*/
    public static void main(String[] args) {

        String s =  "xyxapesj00047519742156243264036";      //"geeks5";
        int len  = 0;
        int last = 0;

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i <s.length(); i++)
            if(Character.isLetter(s.charAt(i))) {
                len++;
            } else {
                sb.append(i);
            }

        last = Integer.valueOf(String.valueOf(sb));
        if(len == last) {
            System.out.println("yes " + last);
        } else {
            System.out.println("No " + last);
        }
        }
}
