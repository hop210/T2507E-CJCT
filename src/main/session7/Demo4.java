package main.session7;

import main.dao.SubjectDaoImpl;
import main.entity.Subject;

import java.util.ArrayList;

public class Demo4 {
    public static void main(String[] args) {
        try {
            SubjectDaoImpl sd = new SubjectDaoImpl();
            ArrayList<Subject> arr =sd.getAll();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
