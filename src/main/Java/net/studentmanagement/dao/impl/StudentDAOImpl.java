package net.studentmanagement.dao.impl;

import net.studentmanagement.dao.StudentDAO;
import net.studentmanagement.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    private SessionFactory sessionFactory;

    @Autowired
    public StudentDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    protected Session getSession() {
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void saveStudent(Student student) {

//        Session session = this.getSession();
        getSession().persist(student);
    }

    @Override
    public void updateStudent(Student student) {
//        Session session = this.getSession();
        getSession().update(student);
    }

    @Override
    public void deleteStudent(int id) {
//        Session session = this.getSession();
        Student student = (Student) getSession().load(Student.class, id);
        if (null != student) {
            getSession().delete(student);
        }
    }

    @Override
    public Student getStudent(int id) {
//        Session session = this.getSession();
        Student student = (Student) getSession().load(Student.class, id);
        return student;
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Student> getAllStudent() {
//        Session session = this.getSession();
        List<Student> studentList = getSession().createQuery("from Student").list();
        return studentList;
    }

}
//commit