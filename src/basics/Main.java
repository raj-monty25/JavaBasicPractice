import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {


    public static Map<String,Integer> processData(ArrayList<String> array) {

        Map<String,Integer> retVal = new HashMap<>();

        int vote = 0;

        for(String str : array) {
            String[] arr = str.split(", ");
            if (vote == 0) {
                vote = Integer.valueOf(arr[3]);
            }
            if(retVal.containsKey(arr[2])){
                if (retVal.get(arr[2]) > vote) {
                    retVal.put(arr[2], Integer.parseInt(arr[0]));
                }
            } else {
                retVal.put(arr[2], Integer.parseInt(arr[0]));
            }
        }


        return retVal;
    }

    public static void main(String[] args) {

        ArrayList<String> array = new ArrayList<>();
        array.add("22, Ravi Pawar, Aundh, 1603");
        array.add("23, Suvarna Kale, Baner, 803");
        array.add("27, Vinod Chavan, Aundh, 809");
        array.add("29, Vasant Mahajan, Aundh, 617");
        array.add("32, Aarti Patil, Baner, 351");
        array.add("34, Swaran Bijur, Baner, 352");

        Main m = null;
        Map<String, Integer> mp =  m.processData(array);
        System.out.println(mp.toString());



    }
}