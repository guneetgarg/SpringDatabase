package com.exp;

import com.db.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Demo1 {

    @Test
    public void aaaaavbna() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://remotemysql.com:3306/hCk6TsYsx3");
        dataSource.setUsername("hCk6TsYsx3");
        dataSource.setPassword("r73Ejra9or");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<String> names = jdbcTemplate.queryForList(
                //SQL Query
                "SELECT id FROM books",
                //Type of values to return
                String.class);

        System.out.println(Arrays.asList(names));


        List<Map<String, Object>> name = jdbcTemplate.queryForList(
                //SQL Query
                "SELECT * FROM books");

        System.out.println(Arrays.asList(name));


    }
}
