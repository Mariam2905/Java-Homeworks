package org.example.experiments.university.repository;

import org.example.experiments.university.model.group.Group;
import org.example.experiments.university.model.human.professor.Professor;
import org.example.experiments.university.model.human.student.Student;

import java.util.List;

public interface GroupRepository {
    void add(Group course);

    Group deleteBy(String name);

    Group getBy(String name);

    List<Group> getAll();

    int getCountOfAll();

    List<Student> getStudentsBy(String groupName);

    int getCountOfStudentsBy(String groupName);

    List<Professor> getProfessorsBy(String groupName);
}
