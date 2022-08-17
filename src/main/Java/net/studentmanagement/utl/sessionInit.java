package net.studentmanagement.utl;

import org.hibernate.Session;

public class sessionInit {
//    Transaction transaction = null;

    public Session getSession() {
        //Transaction transaction = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
//        transaction = session.beginTransaction();
        return session;
    }
    /*public Transaction getTransaction (){
        return transaction;
    }*/

}
