package com.mycompany.ibuffet.db;

import org.hibernate.SessionFactory;

import com.mycompany.ibuffet.dao.HibernateUtil;

public class DBSession {
	
	private SessionFactory sessionFactory = null;
			
   private DBSession dbSession;

public DBSession() {
	this.sessionFactory= HibernateUtil.getInstance().getSessionFactory();
	// TODO Auto-generated constructor stub
}

public SessionFactory getSessionFactory() {
	return sessionFactory;
}

public void setSessionFactory(SessionFactory sessionFactory) {
	this.sessionFactory = sessionFactory;
}

public DBSession getDbSession() {
	return dbSession;
}

public void setDbSession(DBSession dbSession) {
	this.dbSession = dbSession;
}
   
   
}
