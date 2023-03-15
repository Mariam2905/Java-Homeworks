package org.example.experiments.university;

import org.example.experiments.university.model.address.Address;
import org.example.experiments.university.model.group.Group;
import org.example.experiments.university.model.human.student.Degree;
import org.example.experiments.university.model.human.professor.Professor;
import org.example.experiments.university.model.human.student.Student;
import org.example.experiments.university.model.university.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Address addressEPH = new Address("Armenie", "Yerevan", "Aleq Manukyan", "1");
        List<Student> students = new ArrayList<>();
        Student student1 = new Student(1457, "Mariam", "Avetisyan", LocalDate.of(1990,5,29), Degree.BACHELOR);
        Student student2 = new Student(1447, "Angin", "Abroyan", LocalDate.of(1996, 3, 1), Degree.BACHELOR);
        Student student3 = new Student(1437, "Arman", "Hambardzumyan", LocalDate.of(2002, 5, 19),Degree.MASTER);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        List<Professor> professors = new ArrayList<>();
        Professor professor1 = new Professor(131, "John", "Doe", LocalDate.of(1961,10,4), 250000, org.example.experiments.university.model.human.professor.Degree.VISITING);
        Professor professor2 = new Professor(131, "Marc", "Daw", LocalDate.of(1956,12,25), 270000, org.example.experiments.university.model.human.professor.Degree.LECTURER);
        professors.add(professor1);
        professors.add(professor2);
        List<Group> groups = new ArrayList<>();
        Group group1 = new Group("Mathematics", students);
        Group group2 = new Group("Phisics", students);
        groups.add(group1);
        groups.add(group2);
        University universityEPH = new University("EPH", addressEPH);
        System.out.println(universityEPH.toString());
        System.out.println(professor1.getSalary());
        students.remove(1);
    }
}
