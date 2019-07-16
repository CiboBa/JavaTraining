package dataStructuresRevision;

import java.util.HashMap;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<>();
        mapUtil(hashMap);
    }

    private static void mapUtil(Map<Integer, String> map) {
        map.put(101, "Steve");
        map.put(502, "Roger");
        map.put(303, "Michael");
        map.put(908, "Jerry");
        map.put(22, "Frank");

        System.out.println("See all the keys: " + map.keySet());
        System.out.println("see all the key-value pairs: " + map);
        System.out.println(map.get(22));

        for (int key : map.keySet()) {
            System.out.println("KEY: " + key + ". VALUE: " + map.get(key) + ".");
        }
    }
}
