package com.dk.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.apache.log4j.Logger;

import com.dk.model.Student;

public class StudentDaoImpl implements StudentDao{
	private static final Logger log = Logger.getLogger(StudentDaoImpl.class);

	@Override
	public Student findById(int roll) {
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		Student student = em.find(Student.class,roll);
		log.trace(student);
		em.close();
		return student;
	}

	@Override
	public List<Student> findAll() {
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		Query query = em.createQuery("from Student");
		List<Student> list = query.getResultList();
		log.debug("found " + list.size() + " students");
		em.close();
		return list;		
	}

	@Override
	public Student save(Student student) {
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		em.getTransaction().begin();
		System.out.println("before saving " + student);
		em.persist(student);
		System.out.println("after saving : " + student);
		em.getTransaction().commit();;
		em.close();
		return student;	
	}
//	@Override
//	public Student update(Student student) {
//		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
//		em.getTransaction().begin();
//		Student found = findById(student.getRoll());
//		if(found == null) throw new RuntimeException("student not found"+ student.getRoll() );
//		found.setName(student.getName());
//		found.setAge(student.getAge());
//		found.setPhone(student.getPhone());
//		System.out.println("before saving " + student);
//		em.persist(student);
//		System.out.println("after saving : " + student);
//		em.getTransaction().commit();;
//		em.close();
//		return student;	
//	}

}
