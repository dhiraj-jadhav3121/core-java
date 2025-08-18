package Collection;

import java.util.LinkedList;
import java.util.Objects;

public class LinkList {
    public static void main(String[] args) {
        LinkedList<Integer> num = new LinkedList<Integer>();

        num.add(12);
        num.add(32);
        num.add(43);
        num.addFirst(3);
        num.addLast(45);


        System.out.println(num);


    }
}
