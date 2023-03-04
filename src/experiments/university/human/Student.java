package experiments.university.human;

import java.time.LocalDate;

public class Student extends Human implements commonFunctions {
    private String id;
    private DegreeStudent degreeS;

    public Student(String name, String lastName, LocalDate date, String id, DegreeStudent degreeS) {
        super(name, lastName, date);
        this.id = id;
        this.degreeS = degreeS;
    }

    public DegreeStudent getDegreeS() {
        return degreeS;
    }

    public void setDegreeS(DegreeStudent degreeS) {
        this.degreeS = degreeS;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public void participate() {
        System.out.println("I study.");
    }

    @Override
    public void toBreak() {
        System.out.println("I am hungry.");
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                '}';
    }
}
