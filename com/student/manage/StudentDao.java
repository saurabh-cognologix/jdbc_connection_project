package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class StudentDao {
    public static boolean insertStudentToDb(Student st){
        boolean flag = false;
        try {
            //jdbc code
            Connection con = CP.createConnection();
            String q = "insert into student(sname,sphone,scity) values(?,?,?)";

            //Prepared Statement
            PreparedStatement preparedStatement = con.prepareStatement(q);

            //set the value of parameter
            preparedStatement.setString(1, st.getStudentName());
            preparedStatement.setString(2,st.getStudentPhone());
            preparedStatement.setString(3, st.getStudentCity());

            //execute
            preparedStatement.executeUpdate();
            flag=true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }
}
