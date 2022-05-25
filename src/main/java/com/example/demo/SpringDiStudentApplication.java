package com.example.demo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.enitity.Major;
import com.example.demo.enitity.Student;
import com.example.demo.service.impl.MajorService;
import com.example.demo.service.impl.StudentService;


@SpringBootApplication
public class SpringDiStudentApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =
	            SpringApplication.run(SpringDiStudentApplication.class, args);

	        StudentService studentService = context.getBean(StudentService.class);
	        List<Student> list = studentService.findAll();
	            System.out.println("【student】");
	        for (Student u : list) {
	            System.out.println(u.getStudentInfo());
	}
	        MajorService majorService = context.getBean(MajorService.class);
	        List<Major> majorList = majorService.findAll();
	        System.out.println("【major】");
	        for (Major u : majorList) {
	            System.out.println(u.getMajorInfo());
	}
	}
}
