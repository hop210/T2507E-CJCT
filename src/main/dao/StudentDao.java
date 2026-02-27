package main.dao;

import main.entity.Student;

import java.util.ArrayList;

public interface StudentDao {
    ArrayList<Student> getAll();
    boolean create(Student student);
    boolean update(Student student);
    boolean delete(Integer id);
    Student findById(Integer id);
}
