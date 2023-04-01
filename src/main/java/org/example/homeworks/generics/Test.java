package org.example.homeworks.generics;

import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ExchangeElements exchange = new ExchangeElements();
        String[] array = {"A", "B", "C", "D", "E"};
        System.out.println(Arrays.toString(array));
        exchange.exchangeElements(array, 1, 4);
        System.out.println(Arrays.toString(array));

        FindMax findMax = new FindMax();
        List<Integer> list = Arrays.asList(9, 7, 3, 4, 5);
        int max = findMax.findMax(list, 1, 3);
        System.out.println(max);

        Pair<String, Integer> pair = new Pair<>("Mariam", 32);
        System.out.println(pair.toString());

        Library library = new Library();
        library.addMedia("Media");

        GenericList obj = new GenericList<>(10);
        obj.toString();
    }
}
