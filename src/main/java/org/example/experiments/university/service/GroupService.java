package org.example.experiments.university.service;

import org.example.experiments.university.model.group.Group;
import org.example.experiments.university.model.human.professor.Professor;
import org.example.experiments.university.model.human.student.Student;
import org.example.experiments.university.repository.GroupRepository;

import java.util.List;

public class GroupService implements GroupRepository {

    @Override
    public void add(Group course) {

    }

    @Override
    public Group deleteBy(String name) {
        return null;
    }

    @Override
    public Group getBy(String name) {
        return null;
    }

    @Override
    public List<Group> getAll() {
        return null;
    }

    @Override
    public int getCountOfAll() {
        return 0;
    }

    @Override
    public List<Student> getStudentsBy(String groupName) {
        return null;
    }

    @Override
    public int getCountOfStudentsBy(String groupName) {
        return 0;
    }

    @Override
    public List<Professor> getProfessorsBy(String groupName) {
        return null;
    }
}
