package gr.aueb.cf.ch11;

public class Student {
   private static int studentsCount ;
   private int id;
   private String firstname;
   private String lastname;

   static {
      studentsCount = 0;
   }

   //Default Constructor
   public Student() {
      studentsCount ++;
   }

   // Overloaded Constructor
   public Student (int id, String firstname, String lastname){
      this.id = id;
      this.lastname = lastname;
      this.firstname = firstname;
      studentsCount++;

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

   public static int getStudentsCount(){
      return studentsCount;
   }
}
