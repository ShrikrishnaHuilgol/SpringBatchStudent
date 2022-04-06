package com.bean;

public class Student {
    private String studentName;
    private String qualification;
    private float aggregatePercentage;

    public Student(String studentName, String qualification, float aggregatePercentage) {
        this.studentName = studentName;
        this.qualification = qualification;
        this.aggregatePercentage = aggregatePercentage;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", qualification='" + qualification + '\'' +
                ", aggregatePercentage=" + aggregatePercentage +
                '}';
    }
}
