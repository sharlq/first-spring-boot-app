package com.example.demo.student;

import java.time.Month;
import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

@Component // to signal that its a bean
public class StudentService {

    public List<Student> getStudents(){
		return List.of(
			new Student(
				1L,
				"mariam",
				"mar@gmail.com",
				LocalDate.of(2000,Month.JANUARY,5),
				21)
		);
	}
}
