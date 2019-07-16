package dataStructuresRevision;

import java.util.HashSet;
import java.util.Set;

public class Sets {

    public static void main(String[] args) {

        /*
        LinkedHashSet- elements ordered as they were added
        HashSet- random order of elements
        TreeSet- elements alphabetically ordered
         */
        Set<String> animals = new HashSet<String>();

        animals.add("dog");
        animals.add("pig");
        animals.add("hog");
        animals.add("cat");
        animals.add("bee");
        animals.add("bee");
        animals.add("bee");
        animals.add("bee");
        animals.add("elk");

        System.out.println(animals.size() + " " + animals);

        Set<String> farmAnimals = new HashSet<>();
        farmAnimals.add("chicken");
        farmAnimals.add("cow");
        farmAnimals.add("pig");
        farmAnimals.add("sheep");
        farmAnimals.add("bull");
        farmAnimals.add("goose");

        //1.Copy existing set into a new set
        Set<String> intersectionSet = new HashSet<String>(animals);
        System.out.println(intersectionSet);

        //2. Retain only the elements that are also in the othre set
        intersectionSet.retainAll(farmAnimals);
        System.out.println("The intersection is: " + intersectionSet);

        //3. What is the union
        Set<String> unionSet = new HashSet<>(farmAnimals);
        unionSet.addAll(animals);
        System.out.println("The union is: " + unionSet);

        //4. What is the difference
        Set<String> differenceSet = new HashSet<>(farmAnimals);
        differenceSet.removeAll(animals);
        System.out.println("The difference is: " + differenceSet);
    }
}
