package gr.aueb.cf.ch19.enums;

public class Main {
    public static void main(String[] args) {

        UserRole roleStudent = UserRole.STUDENT;
        String strRole = roleStudent.name();
        System.out.println(strRole);

        UserRole role = UserRole.valueOf(strRole);
    }
}
