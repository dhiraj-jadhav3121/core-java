package Collection;

import java.util.*;

public class DemoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(123);
        arrayList.add(213);
        arrayList.add(323);
        arrayList.add(987);
        arrayList.add(123);
        arrayList.add(221);   // duplicate,insertion-order,

        System.out.println(arrayList);

        ArrayList<Integer> newArrayList = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {

            boolean found = false;
            for (int j = i + 1; j < arrayList.size(); j++) {

                if (arrayList.get(i) == arrayList.get(j)) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                newArrayList.add(arrayList.get(i));
            }


        }

        System.out.println(newArrayList);

        //Remove Duplicates from an ArrayList

        Set<Integer> set = new HashSet<>(arrayList);
        // System.out.println(set);
        // using set


        Collections.sort(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);


        //Find Frequency of Elements

        System.out.println(Collections.max(arrayList));
        System.out.println(Collections.min(arrayList));

    }
}
