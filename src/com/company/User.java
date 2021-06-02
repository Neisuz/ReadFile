package com.company;

import java.io.Serializable;

public class User implements Serializable {

    private String name;

    public User(String name, String surname, String secondName, int age, String passport) {
        this.name = name;
        this.surname = surname;
        this.secondName = secondName;
        this.age = age;
        this.passport = passport;
    }

    private String surname;
    private String secondName;
    private int age;
    private String passport;

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassport() {
        return passport;
    }

    public void setPassport(String passport) {
        this.passport = passport;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", secondName='").append(secondName).append('\'');
        sb.append(", age=").append(age);
        sb.append(", passport='").append(passport).append('\'');
        sb.append('}');
        return sb.toString();
    }

//    @Override
//    public String toString() {
//        return  name + "\n" +
//                surname + "\n" +
//                secondName + "\n" +
//                age + "\n" +
//                passport + "\n";
//    }

}
