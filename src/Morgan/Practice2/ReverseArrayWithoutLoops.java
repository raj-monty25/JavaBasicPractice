package Morgan.Practice2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayWithoutLoops {

    public static void reverseList(List<Integer> list, int start, int end) {
        if (start < end) {
            Collections.swap(list, start, end);
            reverseList(list, start + 1, end - 1);
        }
    }

    public static void printList(List<Integer> list, int index) {
        if(index < list.size()) {
            System.out.println(list.get(index) + " ");
            printList(list, index + 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("Print the list : ");
        ReverseArrayWithoutLoops.printList(list, 0);

        ReverseArrayWithoutLoops.reverseList(list, 0, list.size() - 1);

        System.out.println("Print the reversed list : ");
        ReverseArrayWithoutLoops.printList(list, 0);
    }
}
