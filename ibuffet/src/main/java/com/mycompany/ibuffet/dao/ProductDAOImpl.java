package com.mycompany.ibuffet.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;


import com.mycompany.ibuffet.beans.Product;

@Entity
public class ProductDAOImpl implements ProductDAO {


	 Session session = HibernateUtil.getInstance().getSessionFactory().openSession();
	private SessionFactory sessionFactory = HibernateUtil.getInstance().getSessionFactory();
	
	
	public void addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<Product> listProduct() {

		// if (logger.isDebugEnabled()) {
		// logger.debug("getWelcome is executed!");
		// }

		// logs exception
		// logger.error("This is Error message", new Exception("Testing"));
		
		System.out.println("session = "+session);
         
		return (ArrayList<Product>) session.createQuery("from Product ORDER BY name ASC").list();
	}

	public void removeProduct(Integer id) {
		Product product = (Product) sessionFactory.getCurrentSession().load(Product.class, id);
		if (null != product) {
			sessionFactory.getCurrentSession().delete(product);
		}

	}
}