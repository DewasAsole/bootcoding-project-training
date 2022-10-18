package com.bootcoding.restaurant.Dao;

import org.postgresql.Driver;
import java.sql.*;

public class Order_Menu_ItemDao {
    public static final String Table_Name = "order_menu_item";

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
                System.out.println(" = " + rs.getString("order_id"));
                System.out.println(" = " + rs.getString("quantity"));
                System.out.println(" = " + rs.getString("is_veg"));
                System.out.println(" = " + rs.getString("menu_item_name"));
                System.out.println(" = " + rs.getString("total_price"));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}



