package experiments.university.human;

import java.time.LocalDate;

public class Professor extends Human implements commonFunctions {
    private double salary;
    private DegreeTeacher degree;

    public Professor(String name, String lastName, LocalDate date, double salary, DegreeTeacher degree) {
        super(name, lastName, date);
        this.salary = salary;
        this.degree = degree;
    }

    public DegreeTeacher getDegree() {
        return degree;
    }

    public void setDegree(DegreeTeacher degree) {
        this.degree = degree;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void participate() {
        System.out.println("I am teaching.");
    }

    @Override
    public void toBreak() {
        System.out.println("I drink a cup of coffe.");
    }

    @Override
    public String toString() {
        return "Professor{" +
                "salary=" + salary +
                '}';
    }
}
