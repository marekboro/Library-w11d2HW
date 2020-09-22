
// HashMapDemo.java

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> favouriteFruits = new HashMap<String, String>();

        favouriteFruits.put("Alice", "Apple");
        favouriteFruits.put("Sarah", "Banana");
        favouriteFruits.put("Bob", "Strawberry");

        System.out.println(favouriteFruits.get("Alice"));


        HashMap<String, Integer> ages = new HashMap<String, Integer>();

        ages.put("Alice", 52);
        ages.put("Bob", 24);

        Integer aliceAge = ages.get("Alice");

        String output = "Alice's age is " + aliceAge.toString();
        System.out.println(output);

//        favouriteFruits.put(key, value) // inserts a new entry into the HashMap
//        favouriteFruits.get(key) // gets the value for the given key
//        favouriteFruits.size() // returns the size of the HashMap as an integer
//        favouriteFruits.clear() // clears all entries from the HashMap
//        favouriteFruits.containsValue(value) // returns true if the HashMap contains the value
//        favouriteFruits.remove(key) //removes the entry with the given key
        System.out.println("Exercise ----------------- populations HashMap");
        HashMap<String,Long> populations = new HashMap<String, Long>();
        populations.put("UK", 641000000L);
        populations.put("Germany", 80620000L);
        populations.put("France", 66030000L);
        populations.put("Japan", 127300000L);

        System.out.println("Population of UK :" + populations.get("UK"));
        System.out.println("Population of Germany :" +populations.get("Germany"));
        System.out.println("Population of France :" +populations.get("France"));
        System.out.println("Population of Japan :" +populations.get("Japan"));

        System.out.println("size of the populations hashmap: " +populations.size());
        long randoNumber = 5462L;
        System.out.println("Does this hashmap contain " + randoNumber + "?: "+ populations.containsValue(randoNumber));
        System.out.println("Does this hashmap contain " + 80620000L + "?: "+ populations.containsValue(80620000L));
        System.out.println("Experiment 1 '.values' => " + populations.values());
        System.out.println("Experiment 2 '.keySet'  => " + populations.keySet());

    }
}