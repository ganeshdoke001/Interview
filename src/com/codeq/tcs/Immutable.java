package com.codeq.tcs;

import java.util.Collections;
import java.util.List;

import com.codeq.employee.Student;

final class Immutable {

    final private int id;
    final private Student student;
    final private List<Student> studentList;

    public Immutable(int id, Student student, List<Student> studentList) {

        this.id = id;
        this.studentList = Collections.unmodifiableList(studentList);
        // this.studentList = studentList.stream()
        // .toList();
        this.student = new Student(student.getName(), student.getSub());
    }

    public int getId() {

        return id;
    }

    public Student getStudent() {

        return new Student(student.getName(), student.getSub());
    }

    public List<Student> getStudentList() {

        return studentList;
    }
}
