package com.bean;

import java.util.List;

public class Batch {
    private String courseName;
    private String batchCode;
    List<Student> studentList;

    public Batch(String courseName, String batchCode, List<Student> studentList) {
        this.courseName = courseName;
        this.batchCode = batchCode;
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "Batch{" +
                "courseName='" + courseName + '\'' +
                ", batchCode='" + batchCode + '\'' +
                ", studentList=" + studentList + 
                "}";
    }
}
