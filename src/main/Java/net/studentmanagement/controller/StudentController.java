package net.studentmanagement.controller;

import net.studentmanagement.model.Student;
import net.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping ("/")
public class StudentController {


    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }



    @PostMapping ("/insert")
    public String insertStudent(@ModelAttribute("Student") Student student) {
        studentService.saveStudent(student);
        return ("redirect:/list");
    }

//    @GetMapping ("/edit")
//    public String updateStudent(@RequestParam("id") int id, Model model) {
//        Student updateStudent = studentService.getStudent(id);
//        model.addAttribute("student", updateStudent);
//        return "student-form";
//    }

    @GetMapping("/delete")
    public String deleteStudent(@RequestParam("id") int id) {
        studentService.deleteStudent(id);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String listStudent(Model model){
        List <Student> listStudent = studentService.getAllStudent();
        model.addAttribute ("listStudent", listStudent);
        return "student-list";
    }

    @GetMapping("/new")
    public String showNewForm(Model model) {
        Student student = new Student();
        model.addAttribute("student", student);
        return "student-form";
    }
}
//commit