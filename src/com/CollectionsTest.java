package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTest {
    public static void main(String[] args) {
          List<Integer> list =new ArrayList<>();
           list.add(34);
           list.add(55);
           list.add(12);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);
        int max=Collections.max(list);
        int min=Collections.min(list);
        System.out.println(max +" " +min)
        ;
    }
}
