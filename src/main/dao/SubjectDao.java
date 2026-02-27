package main.dao;

import main.entity.Subject;

import java.util.ArrayList;

public interface SubjectDao {
    ArrayList<Subject> getAll();
    boolean create(Subject subject);
    boolean update(Subject subject);
    boolean delete(Integer id);
    Subject findById(Integer id);
}
