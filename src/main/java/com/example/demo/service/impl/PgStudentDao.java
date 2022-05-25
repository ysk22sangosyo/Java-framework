package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.StudentDao;
import com.example.demo.enitity.Student;


@Repository
public class PgStudentDao implements StudentDao {
	
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll() {
        return jdbcTemplate.query("SELECT * FROM student join major on student.major_id = major.major_id",
            new BeanPropertyRowMapper<Student>(Student.class));
    }
}
