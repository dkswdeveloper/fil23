package com.dk.dao;

import javax.persistence.EntityManager;

import com.dk.model.MyBatch;

public class MyBatchDaoImpl {
	public MyBatch findById(int bid)
	{
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		MyBatch mybatch = em.find(MyBatch.class,bid);
//		System.out.println(mybatch);
		return mybatch;
	}
	
	public void saveSomeMyBatchs()
	{
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		MyBatch p1 = new MyBatch(0, "java 1", "java, servlets", "dinesh");
		MyBatch p2 = new MyBatch(0, "Indigo Airlines", "python", "joetellis");
		MyBatch p3 = new MyBatch(0, "Microsoft", "java, springs", "ritwik");
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		em.close();
	}
}
