package com.student.manage;

public class Student {
    private Integer studentId;
    private String studentName;
    private String studentPhone;
    private String studentCity;

    public Student(Integer studentId, String studentName, String studentPhone, String studentCity) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student(String studentName, String studentPhone, String studentCity) {
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student() {
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    @Override
    public String toString() {
        String placeHolder = "Student Id: {0}, Student Name: {1}, Student Phone: {2}, Student City: {3}";
        return java.text.MessageFormat.format(placeHolder,studentId,studentName,studentPhone,studentCity);
//        return "Student{" +
//                "studentId=" + studentId +
//                ", studentName='" + studentName + '\'' +
//                ", studentPhone='" + studentPhone + '\'' +
//                ", studentCity='" + studentCity + '\'' +
//                '}';
    }
}
