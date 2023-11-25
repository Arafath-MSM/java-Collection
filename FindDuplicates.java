package TASK02;
// I certify the code of this lab is entirely my own work,
// but I received assistance from [bard and my friends].
// Follow this with a description of the type of assistance (Ohttps://www.geeksforgeeks.org/hashtable-in-java/).import java.util.*;

class FindDuplicates {

    public static <E> Set<E> findDuplicates(E[] arr) {
        Set<E> set = new HashSet<>();
        Set<E> duplicates = new HashSet<>();

        for (E element : arr) {
            if (!set.add(element)) {
                duplicates.add(element);
            }
        }

        return duplicates;
    }

    public static void main(String[] args) {
        Integer[] data = {11, 123, 3, 14, 23, 3, 412, 3, 2};
        Set<Integer> duplicateElements = findDuplicates(data);
        System.out.println("Duplicate elements: " + duplicateElements);
    }
}
