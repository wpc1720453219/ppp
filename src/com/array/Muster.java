package com.array;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Muster {
    public static void main(String[] args) {
        ArrayList list1=new ArrayList<>();
        LinkedList<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        Iterator<String> it =list.iterator();
          while (it.hasNext()){
              System.out.println(it.next());
          }
    }
}
