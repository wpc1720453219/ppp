package com.wpc;


import java.math.BigInteger;
import java.text.DecimalFormat;

public class Main{
    public  static void SimgleFormat(String pattern,double value) {
        DecimalFormat my = new DecimalFormat(pattern);
        String output = my.format(value);
        System.out.println(value + " " + pattern + " " + output);
    }
     public static void UseApplyPatternMethodFormat(String pattern,double value){
            DecimalFormat my=new DecimalFormat();
            my.applyPattern(pattern);
            System.out.println(value+" "+pattern+" "+my.format(value));
        }

    public static void main(String[] args) {
        BigInteger wpc =new BigInteger("1");
        System.out.println(wpc);
        SimgleFormat("###,###,###",123456.789);
        SimgleFormat("00000000.###kg",123456.789);
        SimgleFormat("000000.000",123.78);
        UseApplyPatternMethodFormat("#.###%",0.789);
        UseApplyPatternMethodFormat("###.##",123456.789);
        UseApplyPatternMethodFormat("0.00\u2030",0.789);

    }
}
