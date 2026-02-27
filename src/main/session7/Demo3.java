package main.session7;

import main.dao.StudentDaoImpl;
import main.entity.Student;

import java.util.ArrayList;

public class Demo3 {
    public static void main(String[] args) {
        try {
            StudentDaoImpl sd = new StudentDaoImpl();
            ArrayList<Student> arr =sd.getAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
