package wpc;

import java.lang.reflect.Array;
import java.util.*;
class Student{
    public String name;
    public  String course;
    public  int total;
    public  Student(){};
    public Student(String name,String course,int total){
        this.name=name;
        this.course=course;
        this.total=total;
    }

}
public class zyr {
    public static void main(String[] args) {
        ArrayList<Student> a = new ArrayList<>();
        a.add(new Student("3", "1", 60));
        a.add(new Student("3", "2", 70));
        a.add(new Student("4", "1", 65));
        a.add(new Student("4", "2", 75));

        Student r = null;
        String name = null;
        int t = 0;
        for (Student stu : a) {
            if(!stu.name.equals(name)){
                r=new Student();
                t=0;
            }
            t=t+stu.total;
            r.total=t;
            name=stu.name;
        }
        System.out.println(r.total);
    }
}
