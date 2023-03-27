package org.example.homeworks.collections.list;

import java.util.ArrayList;
import java.util.Arrays;

public class Replacer<T> {

    /**
     * This method replaces the received element with an ArrayList element.
     * @param list;
     * @param item;
     * @param replaceItem;
     */
    void replaceItem(ArrayList<T> list, T item, T replaceItem) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("The ArrayList is empty. Add an item.");
        }
        if (item == null) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i) == null) {
                    list.set(i, replaceItem);
                }
            }
        } else {
            for (int i = 0; i < list.size(); i++) {
                if (item.equals(list.get(i))) {
                    list.set(i, replaceItem);
                }
            }
        }
    }

    public static void main(String[] args) {
        Replacer obj = new Replacer<>();
//        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 5));
//        System.out.println(list);
//        obj.replaceItem(list, 5, 4);
//        System.out.println(list);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("Cube", "Square", "Circle"));
        System.out.println(list);
        obj.replaceItem(list, "Cube", "Triangle");
        System.out.println(list);
    }
}
