package model;

import java.util.Objects;

public class Faculty {
   public String name;
   private int id;
   public  String email;
   public long phoneNumber;

   @Override
   public String toString() {
      return "Faculty{" +
              "name='" + name + '\'' +
              ", id=" + id +
              ", email='" + email + '\'' +
              ", phoneNumber=" + phoneNumber +
              '}';
   }
   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Faculty faculty = (Faculty) o;
      return id == faculty.id && phoneNumber == faculty.phoneNumber && Objects.equals(name, faculty.name) && Objects.equals(email, faculty.email);
   }

   @Override
   public int hashCode() {
      return Objects.hash(name, id, email, phoneNumber);
   }

   public void setName(String name) {
      this.name = name;
   }

   public void setId(int id) {
      this.id = id;
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

   public int getId() {
      return id;
   }

   public String getEmail() {
      return email;
   }

   public long getPhoneNumber() {
      return phoneNumber;
   }

   public Faculty(String name, int id, String email, long phoneNumber) {
      this.name = name;
      this.id = id;
      this.email = email;
      this.phoneNumber = phoneNumber;
   }
}
