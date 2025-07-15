package cf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Student implements Comparable<Student>{
    private String name;

    private  double gpa;

    public Student(String name,double gpa){
        this.name = name;
        this.gpa = gpa;
    }
    public String getName(){
        return name;
    }

    public double getCpa(){
        return  gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(o.getCpa(),this.getCpa());
    }
}

public class Third {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Charlie",3.5));
        students.add(new Student("Bob",3.7));
        students.add(new Student("Alice",3.5));
        students.add(new Student("Akshit",3.9));

        Comparator<Student> comparator = Comparator.comparing(Student::getCpa).reversed().thenComparing(Student::getName);

        students.sort((o1,o2)-> {
           if(o1.getCpa() - o2.getCpa() > 0){
               return  1;
           }
           else if(o1.getCpa() - o2.getCpa() < 0) {
               return -1;
           }
           else {
               return o2.getName().compareTo(o1.getName());
           }
        });
       for(Student s : students){
            System.out.println(s.getName() + ":" + s.getCpa());
        }
        Collections.sort(students,comparator);

    }
}
