package sk.itsovy.nemeth.school;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Erik", "Niekto", "01/8/1996");
        Student student2 = new Student("Filip", "Neviemkto", "11/14/1995");
        Student student3 = new Student("Zuzana", "Jafaktnetusimkto", "06/23/1997");
        Group group1 = new Group("N1", 4);

        group1.addStudent(student1);
        group1.addStudent(student2);
        group1.addStudent(student3);

        student1.addSubject("MAT");
    }
}
