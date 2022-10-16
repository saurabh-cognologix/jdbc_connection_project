package com.student.manage;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class CP {
    static Connection con;
    public static Connection createConnection(){
        try{
            //load the driver
            Class.forName("com.mysql.jdbc.Driver");

            //create the connection
            String user = "root";
            String password = "Saurabh*789";
            String url = "jdbc:mysql://localhost:3306/jdbc_database";
            con = DriverManager.getConnection(url,user,password);

        }catch (Exception e){
            e.printStackTrace();
        }
        return con;
    }
}
