package com;
public class TryCatchFinally {

public static final String test() {
    String t ="";
    try {
        t ="try";
        return t;
        }
    catch (Exception e) {
        // result = "catch";
        t ="catch";
         return t;
       } finally {
         t = "finally";
        }
       }
 public static void main(String[] args) {
       System.out.print(TryCatchFinally.test());
    }

        }


