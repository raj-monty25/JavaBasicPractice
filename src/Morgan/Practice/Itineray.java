package Morgan.Practice;

import java.util.HashMap;
import java.util.Map;

public class Itineray {

    public static String[] findItineray(String[][] route, String source) {

        Map<String, String> map = new HashMap<>();
        for (String[] ticket : route) {
            map.put(ticket[0], ticket[1]);
        }

        String destination = map.get(source);
        StringBuilder sb = new StringBuilder();
        sb.append(source).append(" -> ");
        while (destination != null) {
            sb.append(destination).append(" -> ");
            destination = map.get(destination);
        }
        sb.setLength(sb.length() - 4);

        return sb.toString().split(" -> ");
    }

    public static void main(String[] args) {
        String[][] tickets = {{"Bangalore", "Delhi"}, {"Mumbai", "Chennai"}, {"Chennai", "Bangalore"}};
        String[] res = Itineray.findItineray(tickets, "Mumbai");

        for (String s : res) {
            System.out.println(s + " ");
        }
    }
}
