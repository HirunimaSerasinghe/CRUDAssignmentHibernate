package net.studentmanagement.controller;

import net.studentmanagement.service.StudentService;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }




}
