package com.exp;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.testng.annotations.Test;

public class Demo {

    @Test
    public void aa() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://remotemysql.com:3306/hCk6TsYsx3");
        dataSource.setUsername("hCk6TsYsx3");
        dataSource.setPassword("r73Ejra9or");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String sql = "INSERT INTO books (title, author, price) VALUES (?, ?, ?)";
        int result = jdbcTemplate.update(sql, "Head First Java", "Guneet Garg", 8.55f);

        result = jdbcTemplate.update(sql, "Head First Java", "Guneet Garg", 8.5f);
        result = jdbcTemplate.update(sql, "Head  Java", "Guneet Garg", 8.5f);
        result = jdbcTemplate.update(sql, "Head First Java", "Guneet", 8.5f);

        if (result > 0) {
            System.out.println("Insert successfully.");
        }
    }
}
