package in.sp.main;
import java.sql.JDBCType;
import java.util.List;

import javax.swing.Spring;

import in.sp.beans.Student;
import in.sp.beans.StudentRowMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.SpringConfig;

public class App {
    public static void main(String[] args){


        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate annotation = context.getBean(JdbcTemplate.class);

        //Insertion Operation
//        int Student_roll=101;
//        String Student_name = "Sachin P Rathod";
//        int Student_marks = 97;
//        String insert_query = "INSERT INTO student VALUES(?,?,?)";
//       int count =  annotation.update(insert_query,Student_roll, Student_name, Student_marks);
//       if (count>0) {
//        System.out.println("Insertion is successfully....");
//       }
//       else{
//       System.out.println("Insertion is failed....");
//       }




       //Update Operation
//        String name = "Shek";
//        int marks = 10;
//        int roll_no=101;
//
//
//        String update_query = "UPDATE student SET name=?, marks=? WHERE roll_no=?";
//        int count = annotation.update(update_query,name,marks,roll_no);
//        if (count>0) {
//            System.out.println("Updation is successfully....");
//        }
//        else{
//            System.out.println("Updation is failed....");
//        }




        //Delete Operation
//        int roll_no= 101;
//        String query_delete = "DELETE FROM student WHERE roll_no=?";
//        int count = annotation.update(query_delete, roll_no);
//        if (count > 0){
//            System.out.println("The data is deleted successfully....");



        //Select the data
            String select_query = "SELECT * FROM student";
           List<Student> list = annotation.query(select_query, new StudentRowMapper());
           for (Student std : list){
               System.out.println("Roll_no: "+std.getRoll_no());
               System.out.println("Name: "+std.getName());
               System.out.println("Marks: "+std.getMarks());
               System.out.println("_____________________________________________");
           }



    }
}
