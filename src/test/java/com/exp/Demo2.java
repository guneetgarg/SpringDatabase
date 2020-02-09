package com.exp;

import com.db.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.testng.annotations.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Demo2 {

    @Test
    public void aaaaavbna() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://remotemysql.com:3306/hCk6TsYsx3");
        dataSource.setUsername("hCk6TsYsx3");
        dataSource.setPassword("r73Ejra9or");

        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        List<Book> bb = jdbcTemplate.query("SELECT * FROM books", new RowMapper<Book>() {
            @Override
            public Book mapRow(ResultSet resultSet, int i) throws SQLException {
                Book b = new Book();
                b.setTitle(resultSet.getString("title"));
                b.setAuthor(resultSet.getString("author"));
                b.setPrice(resultSet.getFloat("price"));
                return b;
            }

        });

        System.out.println(Arrays.asList(bb));

    }
}
