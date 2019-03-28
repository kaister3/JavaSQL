package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUnit {
    private static final String URL = "jdbc:mysql://localhost:3306/gc";
    private static String NAME;
    private static String PWD;

    public static void main(String[] args) {
        DBUnit db = new DBUnit("root", "1998519wyk");
    }
    DBUnit(String name, String password) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            NAME = name;
            PWD = password;
            Connection conn = DriverManager.getConnection(URL, NAME, PWD);
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
