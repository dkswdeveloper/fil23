package com.dk.dao;

import javax.persistence.EntityManager;

import com.dk.model.Project;

public class ProjectDaoImpl {
	public Project findById(int projid)
	{
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		Project project = em.find(Project.class,projid);
//		System.out.println(project);
		return project;
	}
	
	public void saveSomeProjects()
	{
		EntityManager em = EmfProvider.getEntityManagerFactory().createEntityManager();
		Project p1 = new Project(0, "Library", "java, servlets");
		Project p2 = new Project(0, "Indigo Airlines", "python");
		Project p3 = new Project(0, "Microsoft", "java, springs");
		Project p4 = new Project(0, "SBI", "java, dbms");
		em.getTransaction().begin();
		em.persist(p1);
		em.persist(p2);
		em.persist(p3);
		em.persist(p4);
		em.getTransaction().commit();
		em.close();
	}
}
