import com.student.manage.Student;
import com.student.manage.StudentDao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Project Started...." );
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            System.out.println("Press 1 to add student ");
            System.out.println("Press 2 to delete student ");
            System.out.println("Press 3 to display student ");
            System.out.println("Press 4 to exit App");
            int c = Integer.parseInt(br.readLine());

            if(c==1){
                //add student
                System.out.println("Enter Student Name :");
                String name = br.readLine();;

                System.out.println("Enter Student Phone :");
                String phone = br.readLine();

                System.out.println("Enter Student City :");
                String city = br.readLine();

                //created student object to store student
                Student student = new Student(name,phone,city);
                boolean result = StudentDao.insertStudentToDb(student);
                if(result){
                    System.out.println("Student is added successfully");
                }else{
                    System.out.println("Something went wrong");
                }
                System.out.println(student);
            } else if (c==2) {
                //delete student
                System.out.println("Enter Student Id to delete : ");
                int userId = Integer.parseInt(br.readLine());
                boolean result = StudentDao.deleteStudent(userId);
                if(result){
                    System.out.println("Student is deleted successfully");
                }else{
                    System.out.println("Something went wrong");
                }
            } else if (c==3) {
                //display student
            } else if (c==4) {
                //exit
                break;
            }else{
                System.out.println("Please choose correct option ");
            }
        }
        System.out.println("Thankyou for using our application");
    }
}
