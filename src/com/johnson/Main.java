package com.johnson;

public class Main {



    public static void main(String[] args) {
	// write your code here

        Student student = new Student();
        student.name = "Johnson";
        student.setSchoolName("Cambridge University");
        student.setCourse("Java Application Developer");
        student.setLevel(400);
        student.setExamScore1(70);
        student.setExamScore2(100);
        student.setExamScore3(100);

        student.info();
        student.examScores();
    }
}
