package com.student.manage;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class StudentDao {

    //insert student
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

    // student deletion using id
    public static boolean deleteStudent(int userId) {
        boolean flag = false;
        try {
            //jdbc code
            Connection con = CP.createConnection();
            String q = "delete from student where sid=? ";

            //Prepared Statement
            PreparedStatement preparedStatement = con.prepareStatement(q);

            //set the value of parameter
            preparedStatement.setInt(1, userId);


            //execute
            preparedStatement.executeUpdate();
            flag=true;

        }catch (Exception e){
            e.printStackTrace();
        }
        return flag;
    }

    //displaying all the student
    public static void  showStudent() {
        boolean flag = false;
        try {
            //jdbc code
            Connection con = CP.createConnection();
            String q = "select * from student";
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(q);
            while (resultSet.next()){
                Integer id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                String phone = resultSet.getString(3);
                String city = resultSet.getString(4);

                System.out.println("Id :" +id);
                System.out.println("Name :" +name);
                System.out.println("Phone :" +phone);
                System.out.println("City :" +city);
                System.out.println("-------------------------------------");
            }



        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
