package net.studentmanagement.service.impl;

import net.studentmanagement.dao.StudentDAO;
import net.studentmanagement.model.Student;
import net.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    @Transactional
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    @Transactional
    public Student getStudent(int id) {
        return studentDAO.getStudent(id);
    }

    @Override
    @Transactional
    public List<Student> getAllStudent() {
        //List <Student> listOfStudents = new ArrayList<>();
        return studentDAO.getAllStudent();
    }
}
//commit
