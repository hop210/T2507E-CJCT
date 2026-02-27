package main.dao;

import main.database.Database;
import main.entity.Subject;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class SubjectDaoImpl implements SubjectDao{
    Database db = Database.getInstance();

    @Override
    public ArrayList<Subject> getAll() {
        try {
            Database db = Database.getInstance();
            Statement st = db.getStatement();
            String sql = "select * from subject";
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Subject> arr = new ArrayList<>();
            while (rs.next()){
                arr.add(new Subject(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getInt("hours")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean create(Subject subject) {
        try {
            String sql = "insert into subject(name,hours) values(?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,subject.getName());
            pt.setInt(2,subject.getHours());
            pt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Subject subject) {
        try {
            String sql = "update subject set name=?, hours=?  where id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1, subject.getName());
            pt.setInt(2, subject.getHours());
            pt.setInt(3, subject.getId());
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            String sql = "delete from subject where id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setInt(1,id);
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Subject findById(Integer id) {
        return null;
    }
}
