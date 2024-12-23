package gr.aueb.cf.ch11;

public class StudentDemo {
    public static void main(String[] args) {
        Student student = new Student();
        Student bob = new Student(2, "Bod", "D.");

          student.setId(1);                                                       //student.id = 1;
          student.setFirstname("Alice");
          student.setLastname("W.");                                              //student.firstname = "Alice";
                                                                                  // student.lastname = "W.";

        System.out.println("Id: "+ student.getId());                               //  System.out.println("Id: "+ student.id);
        System.out.println("Lastname: "+student.getLastname());                    //   System.out.println("Firstname: "+ student.firstname);
        System.out.println("Firstname: "+ student.getFirstname());               //   System.out.println("Lastname: "+student.lastname);

        System.out.println("Id: "+ bob.getId());                                //  System.out.println("Id: "+ student.id);
        System.out.println("Lastname: "+bob.getLastname());                     //   System.out.println("Firstname: "+ student.firstname);
        System.out.println("Firstname: "+ bob.getFirstname());


        System.out.println("Students Count: "+ Student.getStudentsCount());
    }


}
