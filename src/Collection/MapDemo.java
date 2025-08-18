package Collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {


        Map<String, String> map = new HashMap<>();

        map.put("key1", "value1");   // key is not duplicate  --> set
        map.put("key2", "value1");  // value duplicate  --> list
        map.put("key2", "value1");   //
        map.put("key3", "value1");
        map.put("key4", "value1");

        // map is the combination of set and list


        System.out.println(map);

        // iterate foreach -->  for( int i:j)

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " \t" + entry.getValue());

        }

        System.out.println(map.getOrDefault("key8","key7"));



    }
}
