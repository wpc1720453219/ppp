package wpc;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
       int x= new Scanner(System.in).nextInt();
        int a=1;
        double sum=0;
       while (a<=x){
           double b=1;
           for(int i=1;i<=a;i++)
           {
               b*=i;
           }
           sum+=1/b;
           a++;
       }
        System.out.printf("%.2f",sum);
    }
}
