package ACTIVITY;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

    public static void main(String[] args) {
        Set<Integer> numset = new HashSet<>();
        numset.add(100);
        numset.add(97987);
        numset.add(786254);
        numset.add(8908);
        numset.add(1870);
        numset.add(1000000);

        // Print all numbers in the HashSet
        for(int num : numset) {
            System.out.println(num);
        }

        System.out.println("Size of HashSet: " + numset.size());

        // Removing 8908 (Integer, not String)
        System.out.println("Removing 8908 from HashSet: " + numset.remove(8908));

        // Try removing 9999
        if(numset.remove(9999)) {
            System.out.println("9999 removed from the Set");
        } else {
            System.out.println("9999 is not present in the Set");
        }

        // Search for element 100
        System.out.println("Checking if 100 is present: " + numset.contains(100));

        // Print updated HashSet
        System.out.println("Updated HashSet: " + numset);
    }
}
