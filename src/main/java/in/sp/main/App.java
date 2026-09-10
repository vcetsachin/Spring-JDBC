package in.sp.main;
import java.sql.JDBCType;
import java.util.List;
import java.util.Scanner;

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



                                                                                                          //Select all student the data
//            String select_query = "SELECT * FROM student";
//           List<Student> list = annotation.query(select_query, new StudentRowMapper());
//           for (Student std : list){
//               System.out.println("Roll_no: "+std.getRoll_no());
//               System.out.println("Name: "+std.getName());
//               System.out.println("Marks: "+std.getMarks());
//               System.out.println("_____________________________________________");
//           }


                                                                                                        //Select student using id
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the student roll number: ");
//        int roll_no = sc.nextInt();
//        try{
//            String query_select = "SELECT * FROM student WHERE roll_no=?";
//            Student std1 = annotation.queryForObject(query_select,new StudentRowMapper(),roll_no);
//            System.out.println("Roll_no: "+std1.getRoll_no());
//            System.out.println("Name: "+std1.getName());
//            System.out.println("Marks: "+std1.getMarks());
//            System.out.println("_______________________________________________________________________");
//            System.out.println("Congratulations.... Data Retrieves Successfully..");
//        }
//        catch (Exception e){
//            System.out.println("Error: "+ e.getMessage());
//        }





    }
}
