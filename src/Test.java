import java.util.Random;
import java.util.Scanner;

 class Student{
    String name;
    String xuehao;
    double sorce;
    void setStu(String name,String xuehao,double sorce){
        this.sorce=sorce;
        this.xuehao=xuehao;
        this.name=name;
    }
}
class Test {
    public static void main(String[] args) {
        int n=new Scanner(System.in).nextInt();
        Student[] students=new Student[n];
        for(int i=0;i< students.length;i++){
             students[i]=new Student();
             String line=new Scanner(System.in).nextLine();
              String[] numbers=line.split(" ");
              students[i].setStu(numbers[0],numbers[1],Double.parseDouble(numbers[2]));
        }
        for (int i=0;i<n-1;i++)
            for(int j=0;j<n-i-1;j++){
                if(students[j].sorce>students[j+1].sorce){
                     Student temp=students[j];
                     students[j]=students[j+1];
                     students[j+1]=temp;
                }
            }
        for(int i=0;i<n;i++){
            System.out.println(students[i].name+"  "+students[i].xuehao+"  "+students[i].sorce);
        }
   }

}

