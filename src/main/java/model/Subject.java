package model;

import java.util.Objects;

public class Subject {
public String subjectCode;
public String subjectName;
public String facultyName;

    @Override
    public String toString() {
        return "Subject{" +
                "subjectCode='" + subjectCode + '\'' +
                ", subjectName='" + subjectName + '\'' +
                ", facultyName='" + facultyName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(subjectCode, subject.subjectCode) && Objects.equals(subjectName, subject.subjectName) && Objects.equals(facultyName, subject.facultyName);
    }



    @Override
    public int hashCode() {
        return Objects.hash(subjectCode, subjectName, facultyName);
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setFacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getFacultyName() {
        return facultyName;
    }

    public Subject(String subjectCode, String subjectName, String facultyName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
        this.facultyName = facultyName;
    }
}
