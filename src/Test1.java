import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public  class Test1 {
    /*
    public static boolean check(int a, int b) {
        if(a>5&&b<=5||b>5&&a<=5)
            return true;
        else
            return false;
    }
    public  void bubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }

        }

    }  */
    public void  quickSort(int[] arr){
        Sort(arr,0,arr.length-1);
    }
    public  void  Sort(int[] arr,int left,int right){
        int i,j,t,temp;
        if(left>right)
              return;
        temp=arr[left];
        i=left;
        j=right;
        while (i!=j){
            while (arr[j]>=temp&&i<j) j--;
            while (arr[i]<=temp&&i<j) i++;
            if(i<j){
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
           arr[left]=arr[i];
             arr[i]=temp;
          Sort(arr,left,i-1);
          Sort(arr,i+1,right);
    }
    public static void main(String[] args) {
        String str=new Scanner(System.in).nextLine();
        String[] numbers=str.split(" ");
        int[] array=new int[numbers.length];
        for(int i=0;i<numbers.length;i++){
            array[i]=Integer.parseInt(numbers[i]);
        }
        Test1 ap=new Test1();
        ap.quickSort(array);
        for(int i=0;i<array.length;i++)
            System.out.print(array[i]+" ");
    }

}
