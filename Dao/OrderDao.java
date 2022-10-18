package com.bootcoding.restaurant.Dao;

import org.postgresql.Driver;
import java.sql.*;

public class OrderDao {
    public static final String Table_Name = "\"order\"";

    public void createTable() {
        try {
            Class.forName("org.postgresql.Driver");


            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Dewas@123");
            Statement stmt = con.createStatement();
            String sql = "select * from " + Table_Name;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" = " + rs.getString("order_id"));
                System.out.println(" = " + rs.getString("totalamount"));
                System.out.println(" = " + rs.getString("vendor"));
                System.out.println(" = " + rs.getString("customer"));
                System.out.println(" = " + rs.getString("deliverydate"));
                System.out.println(" = " + rs.getString("orderdate"));
                System.out.println(" = " + rs.getString("orderstatus"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}


