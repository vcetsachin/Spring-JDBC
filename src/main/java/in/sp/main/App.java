package in.sp.main;
import java.sql.JDBCType;

import javax.swing.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import in.sp.beans.SpringConfig;

public class App {
    public static void main(String[] args){
//        int Student_roll=101;
//        String Student_name = "Sachin P Rathod";
//        int Student_marks = 97;

        ApplicationContext context =new AnnotationConfigApplicationContext(SpringConfig.class);
        JdbcTemplate annotation = context.getBean(JdbcTemplate.class);

        //Insertion Operation
        //String insert_query = "INSERT INTO student VALUES(?,?,?)";
//       int count =  annotation.update(insert_query,Student_roll, Student_name, Student_marks);
//       if (count>0) {
//        System.out.println("Insertion is successfully....");
//       }
//       else{
//        System.out.println("Insertion is failed....");
//       }

       //Update Operation
        String name = "Shek";
        int marks = 10;
        int roll_no=101;


        String update_query = "UPDATE student SET name=?, marks=? WHERE roll_no=?";
        int count = annotation.update(update_query,name,marks,roll_no);
        if (count>0) {
            System.out.println("Updation is successfully....");
        }
        else{
            System.out.println("Updation is failed....");
        }


    }

    



}
