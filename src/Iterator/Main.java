package Iterator;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Integer> arr = new ArrayList<Integer>();

        arr.add(3);
        arr.add(32);
        arr.add(13);
        arr.add(36);

        var iterator = new ListIterator<Integer>(arr);

        for (iterator.first(); !iterator.isDone(); iterator.next()) {
            System.out.println(iterator.current().toString());
        }

        System.out.println("-------------------------------------------");

        var reverseIterator = new ReverseListIterator<Integer>(arr);

        for (reverseIterator.first(); !reverseIterator.isDone(); reverseIterator.next()) {
            System.out.println(reverseIterator.current().toString());
        }

        System.out.println();
    }
}
