package com.mycompany.ibuffet.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

private static HibernateUtil instance = new HibernateUtil();

private SessionFactory sessionFactory;

private HibernateUtil(){
    this.sessionFactory = buildSessionFactory();
}

private synchronized static SessionFactory buildSessionFactory() {
    return new AnnotationConfiguration().configure().buildSessionFactory();
}

public static HibernateUtil getInstance() {
    if(instance == null){
        return new HibernateUtil();
    }
    return instance;
}

public SessionFactory getSessionFactory() {
    return sessionFactory;
}

}