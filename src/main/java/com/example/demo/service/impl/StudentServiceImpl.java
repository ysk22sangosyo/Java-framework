package com.example.demo.service.impl;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.StudentDao;
import com.example.demo.enitity.Student;


@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
    private StudentDao studentDao;

    public List<Student> findAll() {
        return studentDao.findAll();
    }
}
