package com.dk;

import org.apache.log4j.Logger;

import com.dk.dao.EmfProvider;
import com.dk.dao.MyBatchDaoImpl;
import com.dk.dao.ProjectDaoImpl;
import com.dk.dao.StudentDao;
import com.dk.dao.StudentDaoImpl;
import com.dk.model.MyBatch;
import com.dk.model.Project;
import com.dk.model.Student;

public class Main {
	private static final Logger log = Logger.getRootLogger();
	public static void main(String[] args) {
		try	
		{
			StudentDao sdao = new StudentDaoImpl();
			Student student = sdao.findById(123);
			log.info(student);
			System.out.println(student);
			Student st = new Student(0,"Aradhya", 22, "854586563");
//			Student saved = sdao.save(st);
//			System.out.println(saved);
			
//			new ProjectDaoImpl().saveSomeProjects();
			ProjectDaoImpl pdao = new ProjectDaoImpl();
			Project project = pdao.findById(2);
			System.out.println(project);
			
			MyBatchDaoImpl batchDao = new MyBatchDaoImpl();
//			batchDao.saveSomeMyBatchs();
			MyBatch b1 = batchDao.findById(1);
			System.out.println(b1);
			//find the names of all students enrolled in batch 1
			
				
//			Query query = em.createQuery("from Student");
//			List list = query.getResultList();
//			list.forEach(log::info);
//			EntityTransaction transaction = em.getTransaction();
//			transaction.begin();
//			Student st = new Student(0, "Aniket", 22, "9898989");
//			em.persist(st);
//
			//			 Student st123 = new Student(123, "Lakshita", 21, "3939393");
			//			 em.persist(st123);
			//			 student.setAge(21);
			//			 student.setPhone("86868686");
//			transaction.commit();


//			em.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			EmfProvider.getEntityManagerFactory().close();
			log.info("emf closed");
		}
	}

}
