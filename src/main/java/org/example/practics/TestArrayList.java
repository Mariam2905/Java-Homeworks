package org.example.practics;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {


        ArrayList<String> list = new ArrayList<>();
        list.add("Eva");
        list.add("David");
        list.add("Zara");
        list.add("Raf");
//        Iterator itr = list.iterator();
//        while(itr.hasNext()){
//            System.out.println(itr.next());
//        }
        for (String s : list) {
            System.out.println(s);
        }
    }
}
