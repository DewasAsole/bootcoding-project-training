package com.bootcoding.restaurant.Dao;

import org.postgresql.Driver;
import java.sql.*;

public class Customer_OrderDao {
    public static final String Table_Name = "customer_order";

    public void createTable() {
        try {
            Class.forName("org.postgresql.Driver");


            Connection con = DriverManager
                    .getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres", "Dewas@123");
            Statement stmt = con.createStatement();
            String sql = "select * from " + Table_Name;
            ResultSet rs = stmt.executeQuery(sql);
            while (rs.next()) {
                System.out.println(" = " + rs.getString("id"));
                System.out.println(" = " + rs.getString("customer_id"));
                System.out.println(" = " + rs.getString("vendor_id"));
                System.out.println(" = " + rs.getString("total_amount"));
                System.out.println(" = " + rs.getString("order_date"));
                System.out.println(" = " + rs.getString("status"));
                System.out.println(" = " + rs.getString("dilevery_address"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

