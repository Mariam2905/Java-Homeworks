package org.example.homeworks.collections.list.custom_linked_list;

public class Test {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList<>();
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        list.iterate();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.iterate();
        list.removeLast();
        System.out.println();
        list.iterate();
        System.out.println(list.contains(3));
    }
}
