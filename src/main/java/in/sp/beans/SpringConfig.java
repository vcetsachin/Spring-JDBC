package in.sp.beans;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class SpringConfig{

    @Bean 
    public DriverManagerDataSource MydataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/spring_jdbc");
        dataSource.setUsername("******");
        dataSource.setPassword("******");
        return dataSource;
    }
    @Bean
    public JdbcTemplate MyjdbcTemplate(DriverManagerDataSource datasource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(datasource);
        return jdbcTemplate;
    }
 }