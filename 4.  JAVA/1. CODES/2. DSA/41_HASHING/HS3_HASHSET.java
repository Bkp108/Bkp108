/*
 ! HASHSET--> random order
 ! LINKEDHASHSET--> order as user input
 !--> TREESET--> sorted in ascending order
 */


import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class HS3_HASHSET {
    public static void main(String[] args) {
        /*
          ! HASHSET:
          ? no duplicate(unique)
          ? unordered
          ? NULL is allowed
          
         * add(key)-------|
         * contains(key)--|--> O(1)
         * remove(key)----|
         */
        // ! *********************************************************************************************
        System.out.println("*********************HASHSET**********************");
        HashSet<Integer> hs = new HashSet<>();
        hs.add(100);
        hs.add(50);
        hs.add(150);
        hs.add(50);

        System.out.println(hs);

        System.out.println(hs.contains(50));
        
        hs.remove(50);
        System.out.println(hs);

        System.out.println(hs.contains(50));

        System.out.println(hs.size());

        hs.clear();
        System.out.println(hs.isEmpty());
        
        
        
        // ! *********************************************************************************************
        System.out.println("*********************LINKEDHASHSET**********************");
        /*
        ! LINKEDHASHSET:(FOLLOW ORDER AS USER INSERT )
        ? no duplicate(unique)
        ? ordered
        ? NULL is allowed
        
        * add(key)-------|
        * contains(key)--|--> O(1)
        * remove(key)----|
        */
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
         lhs.add(100);
         lhs.add(50);
         lhs.add(150);
         lhs.add(50);
         
         System.out.println(lhs);
         
         System.out.println(lhs.contains(50));
         lhs.remove(50);
         System.out.println(lhs);
         System.out.println(lhs.contains(50));
 
         
         System.out.println(lhs.size());
 
         lhs.clear();
         System.out.println(lhs.isEmpty());
         
         
         
         
         
         
         // ! *********************************************************************************************
         System.out.println("*********************TREESET**********************");
         /*
          ! TREESET(red black tree-> self balanced binary search tree)
          ? Sorted in ascending order
          ? Null values are not allowed('because hashset is unsorted all allowed null,
          ? when we sort them for tree set then code is confused that a x number is greater than null or less then null....')
          * O(logn)
          */

        TreeSet<Integer> ths = new TreeSet<>();
         ths.add(100);
         ths.add(50);
         ths.add(150);
         ths.add(50);
         
         System.out.println(ths);
         
         System.out.println(ths.contains(50));
         ths.remove(50);
         System.out.println(ths);
         System.out.println(ths.contains(50));
 
         
         System.out.println(ths.size());
 
         ths.clear();
         System.out.println(ths.isEmpty());
         
        }
}
