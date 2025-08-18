package Collection;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.sql.DriverManager.println;

public class FrequencyDemo {
    public static void main(String[] args) {


        //    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5,5,4,2,1);

        String name = "rajkumar";

        Map<Character, Integer> freqmap = new HashMap<>();

        for (char i : name.toCharArray()) {

            freqmap.put(i, freqmap.getOrDefault(i, 0) + 1);
        }

        freqmap.forEach((key, value) -> System.out.println(key + " ---> " + value));

//
//        for (Map.Entry<Character, Integer> map : freqmap.entrySet()) {
//
//            System.out.println(map.getKey() + "--->" + map.getValue());
//        }

        // print freq of string using map



        List<String> names = Arrays.asList("Rani", "Raj", "Radha");

        names.forEach(System.out::println);

    }
}
