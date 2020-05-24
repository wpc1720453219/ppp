package chazao;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
     // 顺序查找法
    public static int SeqSearch(int[] a,int key){
        for(int i=0;i<a.length;i++)
            if(a[i]==key) return  i;
         return -1;
    }
    //折半查找
    public  static  int BiinSrch(int[] a,int key){
           int head=0,tail=a.length-1;
            int mid;
           while(head<=tail){
               mid=(head+tail)/2;
               if(a[mid]==key) return  mid;
               else if(a[mid]> key)  tail=mid-1;
               else  head=mid+1;
           }
           return -1;
    }



    //希尔排序
    static void ShellInsert(int[] a){
        int n=a.length;
        int h=1;
        while (h<n/3)  h=3*h+1;
        while (h>=1){
            for (int i=h;i<n;i++){
                int j=i-h,k=a[i];
                while (a[i]<a[j])
                {
                    a[j+h]=a[j];
                    j=j-h;
                    if(j<0)  break;
                }
                a[j+h]=k;
            }
                      h=h/3;
        }

    }
    //折半插入排序
    static void BinSort(int[] a){
        for(int i=1;i<a.length;i++){
            int k=a[i];
            int head=0,tail=i-1;
            while (head<=tail){
                int mid=(head+tail)/2;
                if(a[mid]>k)  tail=mid-1;
                else head=mid+1;
            }
           for(int j=i-1;j>=head;--j) a[j+1]=a[j];
           a[head]=k;

        }
    }

    //选择排序
    static  void  SelectSort(int[] a){
        for (int i=0;i<a.length-1;i++){
             int k=i;
             for (int j=i+1;j<a.length;j++){
                 if(a[k]>a[j])    k=j;
                 if(k!=i) {
                     int x=a[i];
                     a[i]=a[k];
                     a[k]=x;
                 }
             }

        }


    }


    public static void main(String[] args) {
        int[] a={5,1,4,3,7,9};
        //int b= new Scanner(System.in).nextInt();
       //   System.out.println(SeqSearch(a,b));
        //System.out.println(BiinSrch(a1,b));
       // InsSort(a);
        //BinSort(a);
        //ShellInsert(a);
        SelectSort(a);
        for (int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");
    }
}
