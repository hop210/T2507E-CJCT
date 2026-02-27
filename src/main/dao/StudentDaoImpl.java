package main.dao;

import main.database.Database;
import main.entity.Student;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDaoImpl implements StudentDao{
    @Override
    public ArrayList<Student> getAll() {
        try {
            Database db = Database.getInstance();
            Statement st = db.getStatement();
            String sql = "select * from students";
            ResultSet rs = st.executeQuery(sql);
            ArrayList<Student> arr = new ArrayList<>();
            while (rs.next()){
                arr.add(new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDate("dob").toLocalDate(),
                        rs.getInt("mark")
                ));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public boolean create(Student student) {
        try {
            Database db = Database.getInstance();
            String sql = "insert into students(name,dob,mark) values(?,?,?)";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1,student.getName());
            pt.setString(2,student.getDob().toString());
            pt.setInt(3,student.getMark());
            pt.executeUpdate();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean update(Student student) {
        try {
            Database db = Database.getInstance();
            String sql = "update students set name=?, dob=?, mark=?  where id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setString(1, student.getName());
            pt.setDate(2, java.sql.Date.valueOf(student.getDob()));
            pt.setInt(3, student.getMark());
            pt.setInt(4, student.getId());
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        try {
            Database db = Database.getInstance();
            String sql = "delete from students where id=?";
            PreparedStatement pt = db.getPreparedStatement(sql);
            pt.setInt(1,id);
            return pt.execute();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public Student findById(Integer id) {
        try {
            Database db = Database.getInstance();
            String sql = "select * from students where id = ?";
            PreparedStatement pt = db.getPreparedStatement(sql);

            // Truyền giá trị ID vào dấu ?
            pt.setInt(1, id);

            // Thực thi truy vấn và nhận kết quả
            ResultSet rs = pt.executeQuery();

            // Nếu rs.next() trả về true, nghĩa là tìm thấy dữ liệu
            if (rs.next()) {
                return new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getDate("dob").toLocalDate(), // Chuyển từ java.sql.Date sang LocalDate
                        rs.getInt("mark")
                );
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
}
