package model;

import java.util.Objects;

public class Student {
    public String name;
    public int rollNumber;
    public String email;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNumber=" + rollNumber +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && phoneNumber == student.phoneNumber && Objects.equals(name, student.name) && Objects.equals(email, student.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, rollNumber, email, phoneNumber);
    }

    public  long phoneNumber;


    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public String getEmail() {
        return email;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public Student(String name, int rollNumber, String email, long phoneNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
}
