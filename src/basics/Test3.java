public class Test3 {

    public static void main(String[] args) {
        String s = "GFG";

        String sec = new String("GFG");

        System.out.println(s == (s.concat(sec)));

        System.out.println(s.equals("" + sec +"g"));
    }
}
