package com.interview.hackerrank.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaSort {

    public static void main(String[] args) {
        Student s1 = new Student(33, "Rumpa", 3.68);
        Student s2 = new Student(85, "Ashis", 3.85);
        Student s3 = new Student(56, "Samiha", 3.75);
        Student s4 = new Student(19, "Samara", 3.75);
        Student s5 = new Student(22, "Fahim", 3.76);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);

        Comparator<Student> comparator = (o1, o2) -> {
            if (o1.getCgpa().compareTo(o2.getCgpa()) != 0)
                return o1.getCgpa().compareTo(o2.getCgpa());
            if (o1.getFname().compareTo(o2.getFname()) != 0)
                return o1.getFname().compareTo(o2.getFname());
            return o1.getId().compareTo(o2.getId());
        };
        Collections.sort(studentList, comparator);

        for (Student st : studentList) {
            System.out.println(st.getFname());
        }

    }
}

class Student {
    private Integer id;
    private String fname;
    private Double cgpa;

    public Student(Integer id, String fname, Double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public Integer getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public Double getCgpa() {
        return cgpa;
    }
}
