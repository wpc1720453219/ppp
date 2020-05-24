package one;

public class Main {
  public static int  wpc(int sum){
       for( int i=2;i<sum;i++)
           if(sum%i==0) return 0;
        return 1;
  }
    static  int test(){
        int flag,i,j;
        for( i=4;i<=100;i=i+2){
               flag=0;
            for( j=2;j<50;j++){
                if(wpc(j)==1 && wpc(i-j)==1){
                    flag=1;
                    if(j>=50) return 0;
                }
                 if(flag==1)  continue;
                 return 1;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        System.out.println(test());
    }
}
