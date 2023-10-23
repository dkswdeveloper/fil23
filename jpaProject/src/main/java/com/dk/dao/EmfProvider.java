package com.dk.dao;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.apache.log4j.Logger;

public class EmfProvider {
	private static final Logger log = Logger.getLogger(EmfProvider.class);
	
	private static EntityManagerFactory factory = null;
	public static EntityManagerFactory getEntityManagerFactory()
	{
		log.debug("trying to connect to db");
		try	
		{
			factory = Persistence.createEntityManagerFactory("fil23PU");
			 log.info("emf created " + factory);
			 return factory;
		}
		catch(Exception e)
		{
			log.error(e);
			return null;
		}
	}
}
