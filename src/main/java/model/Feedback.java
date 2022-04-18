package model;

import java.util.Objects;

public class Feedback {
    public int id;
    public char stars;
    public  String question;
    public String other;

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", stars=" + stars +
                ", question='" + question + '\'' +
                ", other='" + other + '\'' +
                '}';
    }



    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feedback feedback = (Feedback) o;
        return id == feedback.id && stars == feedback.stars && Objects.equals(question, feedback.question) && Objects.equals(other, feedback.other);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, stars, question, other);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setStars(char stars) {
        this.stars = stars;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setOther(String other) {
        this.other = other;
    }

    public int getId() {
        return id;
    }

    public char getStars() {
        return stars;
    }

    public String getQuestion() {
        return question;
    }

    public String getOther() {
        return other;
    }

    public Feedback(int id, char stars, String question, String other) {
        this.id = id;
        this.stars = stars;
        this.question = question;
        this.other = other;
    }
}
