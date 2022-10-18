package com.bootcoding.restaurant.Dao;

import org.postgresql.Driver;
import java.sql.*;

        public class VendorDao {
            public static final String Table_Name = "vendor";

            public void createTable() {
                try {
                    Class.forName("org.postgresql.Driver");


                    Connection con = DriverManager
                            .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Dewas@123");
                    Statement stmt = con.createStatement();
                    String sql = "select * from " + Table_Name;
                    ResultSet rs = stmt.executeQuery(sql);
                    while (rs.next()) {
                        System.out.println(" = " + rs.getString("name"));
                        System.out.println(" = " + rs.getString("address"));
                        System.out.println(" = " + rs.getString("phone_no"));
                        System.out.println(" = " + rs.getString("city"));
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }



