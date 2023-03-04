package experiments;

import experiments.university.address.Address;
import experiments.university.human.DegreeStudent;
import experiments.university.human.DegreeTeacher;
import experiments.university.human.Professor;
import experiments.university.human.Student;
import experiments.university.uni.Course;
import experiments.university.uni.University;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Address addressEPH = new Address("Armenie", "Yerevan", "Aleq Manukyan", "1");
        University universityEPH = new University("EPH", addressEPH);
        List<Student> students = new ArrayList<>();
        Student student1 = new Student("Mariam", "Avetisyan", LocalDate.of(1990, 5, 29), "1457", DegreeStudent.BACHELOR);
        Student student2 = new Student("Angin", "Abroyan", LocalDate.of(1996, 3, 1), "1447", DegreeStudent.BACHELOR);
        Student student3 = new Student("Arman", "Hambardzumyan", LocalDate.of(2002, 5, 19), "1437", DegreeStudent.MASTER);
        students.add(student1);
        students.add(student2);
        students.add(student3);
        List<Course> courses = new ArrayList<>();
        Professor teacher1 = new Professor("John", "Doe", LocalDate.of(1961, 10, 4), 250000, DegreeTeacher.LECTURER);
        Professor teacher2 = new Professor("Sae", "Daw", LocalDate.of(1956, 10, 4), 270000, DegreeTeacher.VISITING);
        Course course1 = new Course("Mathematics", teacher1, students);
        Course course2 = new Course("Phisics", teacher2, students);
        courses.add(course1);
        courses.add(course2);
        System.out.println(universityEPH.toString());
        universityEPH.setCourses(courses);
        System.out.println(universityEPH.toString());
    }
}
