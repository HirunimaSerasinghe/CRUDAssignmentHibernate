package net.studentmanagement.service.impl;


import net.studentmanagement.Repository.StudentRepository;
import net.studentmanagement.model.Student;
import net.studentmanagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    @Transactional
    public void saveStudent(Student student) {
        studentRepository.save(student);
    }


    @Override
    @Transactional
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }


    @Override
    @Transactional
    public List<Student> getAllStudent() {
        //List <Student> listOfStudents = new ArrayList<>();
        return studentRepository.findAll();
    }
}
//commit
