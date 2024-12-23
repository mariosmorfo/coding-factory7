package gr.aueb.cf.ch11;

public class Student {
   private int id;
   private String firstname;
   private String lastname;

   //Default Constructor
   public Student() {
   }

   // Overloaded Constructro
   public Student (int id, String firstname, String lastname){
      this.id = id;
      this.lastname = lastname;
      this.firstname = firstname;

   }

   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public String getFirstname() {
      return firstname;
   }

   public void setFirstname(String firstname) {
      this.firstname = firstname;
   }

   public String getLastname() {
      return lastname;
   }

   public void setLastname(String lastname) {
      this.lastname = lastname;
   }
}
