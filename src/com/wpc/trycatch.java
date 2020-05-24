package com.wpc;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class trycatch {
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入商品的生产日期：（yyyy-MM-dd）");
        String data=new Scanner(System.in).next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
          Date w=sdf.parse(data);
        System.out.println("请输入保存期");
           int a=new Scanner(System.in).nextInt();
    }
}