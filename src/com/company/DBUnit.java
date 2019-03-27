package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBUnit {
    private static final String URL = "jdbc:mysql://localhost:3306/gc";
    private static final String NAME = "root";
    private static final String PWD = "1998519wyk";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
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
