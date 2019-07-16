package dataStructuresRevision;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();

        cities.add("Cleveland");
        cities.add("Toronto");
        cities.add("Chicago");
        cities.add("Miami");
        cities.add("Miami");

        System.out.println(cities.size());

        for (String city : cities) {
            System.out.print(city + "\n");
        }

        int size = cities.size();
        System.out.println("There are " + size + " elements in the list");

        System.out.println(cities.get(0));

        cities.remove(1);
        System.out.println("Now there are " + cities.size() + " elements");
        System.out.println(cities.get(1));
    }
}
