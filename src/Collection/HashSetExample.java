package Collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<Integer> number = new LinkedHashSet<>();    // set does not support index base iteration

        number.add(11);
        number.add(22);
        number.add(54);
        number.add(154);
        number.add(13);

        Set<Integer> number2 = new HashSet<>();    // set does not follow insertion order -->

        number2.add(11);
        number2.add(121);
        number2.add(876);
        number2.add(987);


    }
}
