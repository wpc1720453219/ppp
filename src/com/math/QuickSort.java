package com.math;
import java.util.Scanner;

public class  QuickSort{
     static  void down(int i,int n,int[] a){
          int t,flag=0;
         while(i*2<=n&&flag==0){
             if(a[i]<a[i*2])  t=i*2;
             else  t=i;
             if(i*2+1<n){
                 if(a[i*2+1]>a[t]) t=i*2+1;
             }
             if(t!=i){
                 int temp=a[t];
                   a[t]=a[i];
                   a[i]=temp;
                   i=t;
             }
             else  flag=1;
         }
     }
    public static void main(String[] args) {
        String  sum= new Scanner(System.in).nextLine();
        String[] numbers=sum.split(" ");
        int[] a=new int[numbers.length];
        for(int i=0;i<numbers.length;i++)
             a[i]=Integer.parseInt(numbers[i]);
        for(int i=a.length/2;i>=0;i--)
             down(i,a.length,a);

        for (int i=0;i<a.length;i++)
        System.out.printf("%d ",a[i]);
    }

}
