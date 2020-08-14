package practice;

import java.util.*;

public class CompareDemo {
    public static void main(String[] args) {
        Student stu1 = new Student(18);
        Student stu2 = new Student(20);
        List<Student> stus = new ArrayList<>(Arrays.asList(stu2,stu1));
        for (Student student : stus) {
            System.out.println(student.age);
        }
        Collections.sort(stus);
        for (Student student : stus) {
            System.out.println(student.age);
        }
        int[] arr = new int[19];
        byte[] arr1 = new byte[12];
        char[] arr2 = new char[123];

        Teacher tea1 = new Teacher(18);
        Teacher tea2 = new Teacher(20);
        List<Teacher> teas = new ArrayList<>(Arrays.asList(tea2, tea1));
        for (Teacher tea : teas) {
            System.out.println(tea.age);
        }
        teas.sort(Comparator.comparingInt(v -> v.age));

    }
}

class Student implements Comparable<Student>{
    int age;
    Student (int age){
        this.age = age;
    }


    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
}

class Teacher {
    int age;
    Teacher (int age){
        this.age = age;
    }
}