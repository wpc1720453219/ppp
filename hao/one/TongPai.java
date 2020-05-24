package one;

import java.util.Scanner;

public class TongPai {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int[] a=new int[1001];
        for(int i=0;i<n;i++){
            System.out.println("www");
            int c=scanner.nextInt();
            System.out.println("ppp");
               a[c]++;
        }
        for(int i=0;i<=1000;i++){
            for(int x=a[i];x>0;x--) System.out.print(i+" ");
        }
    }
}
