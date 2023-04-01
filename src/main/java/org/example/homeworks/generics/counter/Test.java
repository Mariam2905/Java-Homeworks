package org.example.homeworks.generics.counter;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(7);
        arr.add(8);
        arr.add(9);
        int count = SpecificCollectionProperty.countElements(arr, new OddInteger());
        System.out.println("count of odd integers -> " + count);

        List<Integer> arr2 = new ArrayList<>();
        arr2.add(13);
        arr2.add(17);
        arr2.add(10);

        int count1 = SpecificCollectionProperty.countElements(arr2, new PrimeNumbers());
        System.out.println("prime number count -> " + count1);

        List<String> str = new ArrayList<>();
        str.add("anssna");
        str.add("ssaass");
        str.add("arrrra");
        str.add("capasity");
        int count2 = SpecificCollectionProperty.countElements(str, new Palindrome());
        System.out.println("count of palindromes -> " +  count2);
    }
}
