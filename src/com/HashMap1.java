package com;
import java.util.*;

public class HashMap1 {
      public static void main(String[] args) {
         ArrayList<Character> charList=new ArrayList<>();
         HashSet<Character>  charSet=new HashSet<>();
          charList.add('A');
          charList.add('a');
          charList.add('C');
          charList.add('c');
          charList.add('a');
          System.out.println(charList);
          charSet.addAll(charList);
          System.out.println(charSet);
      }

}
