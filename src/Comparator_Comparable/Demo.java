package Comparator_Comparable;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int i, String string) {
        this.age = i;
        this.name = string;
    }

    @Override
    public String toString() {
        return "Student [age = " + age + ", name = " + name + "]";
    }

    @Override
    public int compareTo(Student that) {
        if (this.age > that.age)
            return 1;
        else
            return -1;
    }
}

public class Demo{
    public static void main(String[] args) {


        //Want to sort Students by age
        // --> Use Comparator for that.
        //Why is Does Collections.sort work for Integer but not for Student?
        //Because Integer implements Comparable. I have not in the Student class.
        //I have now using Comparable.
        //I can still override my Comparable logic using the Comparator.
        Comparator<Student> com = new Comparator<Student>() {
            public int compare(Student i, Student j) {
                if (i.age > j.age)
                    return 1;
                else
                    return -1;
            }
        };

        List<Student> studs = new ArrayList<>();
        studs.add(new Student(21, "Leon"));
        studs.add(new Student(26, "Marc"));
        studs.add(new Student(30, "Jason"));
        studs.add(new Student(19, "Choi"));

        //if i Use Comparable:
        //Collections.sort(studs);

        //Using Comparator:
        Collections.sort(studs, com);

        //for each loop for printing that out.
        for (Student s : studs)
                System.out.println(s);        
    }
}
