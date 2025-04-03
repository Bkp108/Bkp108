
// import java.util.*;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;
import java.util.HashMap;

public class HS2_HASHMAP_LINKEDHASHMAP_TREEMAP {
    public static void main(String[] args) {
        /*
          ! HASHMAP --> (key, value)
          ? key is unique in data, value can repeate
          ? TIME COMPLEXITY OF HASH MAP IN INSERT----|
          ? REMOVE----|-- O(1)
          ? SEARCH----|
        */

        /*
          ! HASHMAP
          ? In 'HashMap' 1st create a bucket arr where each index have inside a "Singly-linked list"
          ! LINKED-HASHMAP
          ? In 'LINKED-HashMap' 1st create a bucket arr where each index have inside a "Doubly-linked list"
         */

        // ! *********************************************************************************************
        System.out.println("*********************HASHMAP**********************");
        HashMap<String, Integer> hm = new HashMap<>(); // ? random order
        // ? Insert--O(1)
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Indonesia", 6);
        hm.put("Nepal", 5);

        System.out.println(hm);

        // ?get O(1)
        int population = hm.get("India");
        System.out.println(population);

        // ? Contain key O(1)
        System.out.println(hm.containsKey("India"));

        // ? remove
        System.out.println(hm.remove("China"));
        System.out.println(hm);

        // ? size
        System.out.println(hm.size());

        // ?is empty
        System.out.println(hm.isEmpty());

        // ? clear all data
        hm.clear();
        System.out.println(hm);

        // ? Iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys: " + k + ", values: " + hm.get(k));
        }

        System.out.println(hm.entrySet());

        // ! *********************************************************************************************
        System.out.println("*********************LINKED-HASHMAP*********************");
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>(); // ? fixed order
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("US", 50);
        lhm.put("Indonesia", 6);
        lhm.put("Nepal", 5);

        System.out.println("LinkedHashMap: " + lhm);

        // ?get O(1)
        int population1 = lhm.get("India");
        System.out.println(population1);

        // ? Contain key O(1)
        System.out.println(lhm.containsKey("India"));

        // ? remove
        System.out.println(lhm.remove("China"));
        System.out.println(lhm);

        // ? size
        System.out.println(lhm.size());

        // ?is empty
        System.out.println(lhm.isEmpty());

        // ? clear all data
        lhm.clear();
        System.out.println(lhm);

        // ! *********************************************************************************************
        System.out.println("*********************TREEMAP***********************");
        /* 
          ! TREE MAP
          ? keys are Sorted
          ? put, get, remove ----> O(logn)
          * In TREEMAP we us RED-BLACK TRE data Structure (BST- Self balanced tree)
         */

        TreeMap<String, Integer> thm = new TreeMap<>(); // ? fixed order
        thm.put("India", 100);
        thm.put("China", 150);
        thm.put("US", 50);
        thm.put("Indonesia", 6);
        thm.put("Nepal", 5);
        System.out.println("TreeMap: " + thm);

        // ?get O(1)
        int population2 = thm.get("India");
        System.out.println(population2);

        // ? Contain key O(1)
        System.out.println(thm.containsKey("India"));

        // ? remove
        System.out.println(thm.remove("China"));
        System.out.println(thm);

        // ? size
        System.out.println(thm.size());

        // ?is empty
        System.out.println(thm.isEmpty());

        // ? clear all data
        thm.clear();
        System.out.println(thm);
     
    }
}
