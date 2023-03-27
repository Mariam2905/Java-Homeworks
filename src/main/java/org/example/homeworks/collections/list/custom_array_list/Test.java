package org.example.homeworks.collections.list.custom_array_list;

import org.example.homeworks.collections.list.custom_array_list.MyArrayList;

public class Test {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);
        list.printAllElements();
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains(4));
        list.contains(1);
        System.out.println(list.set(1, "i"));
        list.printAllElements();
    }
}
