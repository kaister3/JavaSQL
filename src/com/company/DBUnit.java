package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author : KrisWang
 */
public class DbUnit {
    private static String URL = "jdbc:mysql://localhost:3306/";

    public static void main(String[] args) {
        DbUnit db = new DbUnit("root", "1998519wyk", null);
    }
    DbUnit(String name, String password, String database) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            URL = URL + database;
            Connection conn = DriverManager.getConnection(URL, name, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("select * from paper");
            while (rs.next()) {
                System.out.println(rs.getString("name") + ":" +
                        rs.getString("detail"));
            }
        }  catch (Exception e){
            e.printStackTrace();
        }
    }
}
