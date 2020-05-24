package com.math;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class tongSort {
   static  void sort(int[] array,int head,int high ){
            if(head>high) return;
            int i=head;
            int j=high;
            int temp=array[head];
            while (i!=j){
                   while (array[j]>=temp&&i<j) j--;
                   while (array[i]<=temp&&i<j) i++;
                   if(i<j){
                          int sum=array[i];
                          array[i]=array[i+1];
                          array[i]=sum;
                   }
            }
            array[head]=array[i];
            array[i]=temp;
            sort(array,head,i-1);
            sort(array,i+1,high);
       }
       public static void main(String[] args) {
              String str=new Scanner(System.in).nextLine();
              String[] numbers=str.split(" ");
              int[] array=new int[numbers.length];
              for(int i=0;i<numbers.length;i++){
                     array[i]=Integer.parseInt(numbers[i]);
              }
              sort(array,0,array.length-1);
              for(int i=0;i<array.length;i++)
                     System.out.print(array[i]+" ");
       }



}
