package net.studentmanagement.service;

import net.studentmanagement.dao.StudentDAO;
import net.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO;

    @Autowired
    public StudentServiceImpl(StudentDAO studentDAO) {
        this.studentDAO = studentDAO;
    }

    @Override
    public void saveStudent(Student student) {
        studentDAO.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDAO.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDAO.deleteStudent(id);
    }

    @Override
    public Student getStudent(int id) {
        Student student = studentDAO.getStudent(id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> listOfStudents = studentDAO.getAllStudent();
        //List <Student> listOfStudents = new ArrayList<>();
        return listOfStudents;
    }
}
