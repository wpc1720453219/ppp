import java.text.SimpleDateFormat;
import java.util.*;

class Student1 implements Comparable<Student1>{
    private String name;
    private int age;

    public Student1() {
    }
    @Override
    public int compareTo(Student1 o) {
        return this.age-o.age;//升序
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}
public class HelloWorld {
    public static void main(String[] args) throws Exception {
        ArrayList<Student1> list = new ArrayList<Student1>();

        list.add(new Student1("rose",18));
        list.add(new Student1("jack",16));
        list.add(new Student1("abc",16));
        list.add(new Student1("ace",17));
        list.add(new Student1("mark",16));
        Collections.sort(list);
        for (Student1 student : list) {
            System.out.println(student);
        }

    }

}
