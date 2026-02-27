package main.session7;

import java.sql.*;
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        String connectionString = "jdbc:mysql://localhost:3306/t2307e_jp";
        String user = "root";
        String password = "";
        String driver = "com.mysql.cj.jdbc.Driver";

        try {
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(connectionString,user,password);
            Statement stt = conn.createStatement();

//            String sql1 = "INSERT INTO subject (name, hours) VALUES ('toan', 4)";
//            stt.execute(sql1);
//
//            String sql2 = "INSERT INTO subject (name, hours) VALUES ('van', 6)";
//            stt.execute(sql2);
//
//            String sql3 = "INSERT INTO subject (name, hours) VALUES ('anh', 7)";
//            stt.execute(sql3);

            String sql1 = "INSERT INTO subject (name, hours) VALUES(?,?)";
            PreparedStatement pt = conn.prepareStatement(sql1);
            Scanner sc = new Scanner(System.in);
            System.out.print("Nhập tên môn: ");
            pt.setString(1,sc.nextLine());
            System.out.print("Nhập số giờ môn : ");
            pt.setInt(2,sc.nextInt());
            pt.execute();

            String sql = "select * from subject";
            ResultSet rs = stt.executeQuery(sql);
            while (rs.next()){
                Integer id = rs.getInt("id");
                String name = rs.getString("name");
                Integer hours = rs.getInt("hours");
                System.out.println("id:"+id+"--name:"+name+"--hours:"+hours);
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
