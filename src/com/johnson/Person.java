package com.johnson;

public class Person {

    String name;
    int age;
    String company;
    String job;
    String hobby;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    public Person( String company, String job, String hobby) {

        this.company = company;
        this.job = job;
        this.hobby = hobby;
    }

    public Person() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public void talkAboutYourself(){
        System.out.println("Hi, I'm " + name + ".");
        System.out.println("I'm " + age + " years old.");
        System.out.println("I work at " + company + " as a " + job + ".");
        System.out.println("When I get some free time, I like to " + hobby + ".");
    }


}
