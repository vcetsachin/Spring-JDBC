package in.sp.beans;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StudentRowMapper implements RowMapper<Student> {


    @Override
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setRoll_no(rs.getInt("roll_no"));
        student.setName(rs.getString("name"));
        student.setMarks(rs.getInt("marks"));
        return student;
    }
}