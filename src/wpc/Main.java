package wpc;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
            long[] b=new long[a];
        long[] c=new long[a];
           for(int i=0;i<a;i++){
               b[i]=scanner.nextInt();
               c[i]=-1;
           }
        for(int i=0;i<a;i++)
            for (int j=i+1;j<a;j++){
                    if((b[i]&b[j])==0)
                         c[i]=1;
            }
        for (int i=0;i<a;i++)
            System.out.print(c[i]+" ");
    }


}
