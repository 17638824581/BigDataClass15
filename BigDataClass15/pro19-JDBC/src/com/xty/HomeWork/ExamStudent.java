package com.xty.HomeWork;

public class ExamStudent {
    private int flowid;
    private int type;
    private String idcard;
    private String examcard;
    private String studentname;
    private String location;
    private int grade;

    public ExamStudent() {
    }

    public ExamStudent(int flowid, int type, String idcard, String examcard, String studentname, String location, int grade) {
        this.flowid = flowid;
        this.type = type;
        this.idcard = idcard;
        this.examcard = examcard;
        this.studentname = studentname;
        this.location = location;
        this.grade = grade;
    }

    public int getFlowid() {
        return flowid;
    }

    public void setFlowid(int flowid) {
        this.flowid = flowid;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getExamcard() {
        return examcard;
    }

    public void setExamcard(String examcard) {
        this.examcard = examcard;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "ExamStudent{" +
                "flowid=" + flowid +
                ", type=" + type +
                ", idcard='" + idcard + '\'' +
                ", examcard='" + examcard + '\'' +
                ", studentname='" + studentname + '\'' +
                ", location='" + location + '\'' +
                ", grade=" + grade +
                '}';
    }
}
