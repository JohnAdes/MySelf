package com.johnson;

public class Student extends Person {

    private String schoolName;
    private int level;
    private String course;
    private double examScore1;
    private double examScore2;
    private double examScore3;

    public Student() {

    }

    public Student(String name, int age, String schoolName, int level, String course, double examScore1, double examScore2, double examScore3) {
        super(name, age);
        this.schoolName = schoolName;
        this.level = level;
        this.course = course;
        this.examScore1 = examScore1;
        this.examScore2 = examScore2;
        this.examScore3 = examScore3;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public double getExamScore1() {
        return examScore1;
    }

    public void setExamScore1(double examScore1) {
        this.examScore1 = examScore1;
    }

    public double getExamScore2() {
        return examScore2;
    }

    public void setExamScore2(double examScore2) {
        this.examScore2 = examScore2;
    }

    public double getExamScore3() {
        return examScore3;
    }

    public void setExamScore3(double examScore3) {
        this.examScore3 = examScore3;
    }

    public void info(){
        System.out.println("I am " + name + " | " + schoolName + " | "  + course + " | " + level );
    }
    public void examScores() {
        double sum = (examScore1 + examScore2 + examScore3)/3;
        double avg = sum/3;
        System.out.println(" Total = " + sum + " Exam Score Average = " + avg);
        }
        }
