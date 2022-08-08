package net.studentmanagement.service;

import net.studentmanagement.dao.StudentDaoInterface;
import net.studentmanagement.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Autowired
    public StudentDaoInterface studentDaoInterface;

    @Override
    public void saveStudent(Student student) {
        studentDaoInterface.saveStudent(student);
    }

    @Override
    public void updateStudent(Student student) {
        studentDaoInterface.updateStudent(student);
    }

    @Override
    public void deleteStudent(int id) {
        studentDaoInterface.deleteStudent(id);
    }

    @Override
    public Student getStudent(int id) {
        Student student = studentDaoInterface.getStudent(id);
        return student;
    }

    @Override
    public List<Student> getAllStudent() {
        List < Student > listOfStudents = studentDaoInterface.getAllStudent();
        return listOfStudents;
    }
}
