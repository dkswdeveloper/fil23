package com.dk;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.apache.log4j.Logger;
import org.hibernate.dialect.function.AbstractAnsiTrimEmulationFunction;

import com.dk.model.Student;

public class Main {
	private static final Logger log = Logger.getRootLogger();
	public static void main(String[] args) {
		EntityManagerFactory emf = null;
		try	
		{
			 emf = Persistence.createEntityManagerFactory("fil23PU");
			 EntityManager em = emf.createEntityManager();
			 Student student = em.find(Student.class, 123);
			 log.info(student);
			 Query query = em.createQuery("from Student");
			 List list = query.getResultList();
			 list.forEach(log::info);
			 EntityTransaction transaction = em.getTransaction();
			 transaction.begin();
			 Student st = new Student(0, "Aniket", 22, "9898989");
			 em.persist(st);
			 
//			 Student st123 = new Student(123, "Lakshita", 21, "3939393");
//			 em.persist(st123);
//			 student.setAge(21);
//			 student.setPhone("86868686");
			 transaction.commit();
			 
			 
			 em.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			emf.close();
		}
	}

}
