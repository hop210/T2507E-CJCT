package main.session7;

import java.sql.*;
import java.time.LocalDate;


public class Demo1 {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/t2307e_jp";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";
        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            Statement stt = conn.createStatement();

            // thêm 1 sinh viên vào table
//            String sql1 = "INSERT INTO students (name, dob, mark) VALUES ('Phan Duc H', '2002-12-21', 10)";
//            stt.execute(sql1);
////            int rowsAffected = stt.executeUpdate(sql1);
////            System.out.println("Đã thêm thành công " + rowsAffected + " sinh viên!\n");

//            String sql2 = "INSERT INTO students (name, dob, mark) VALUES(?,?,?)";
//            PreparedStatement pt = conn.prepareStatement(sql2);
//            pt.setString(1,"Nguyễn Công Tiến");
//            pt.setDate(2,Date.valueOf("1990-09-27"));
//            pt.setInt(3,9);
//            pt.execute();

            // lấy thông tin sinh viên
            String sql = "select * from students";
            ResultSet rs = stt.executeQuery(sql);
            // in ra thông tin
            while (rs.next()){
                Integer x = rs.getInt("id");
                String y = rs.getString("name");
                LocalDate z = rs.getDate("dob").toLocalDate();
                Integer t = rs.getInt("mark");
                System.out.println(x+"--"+y+"--"+z+"--"+t);
            }
            conn.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
