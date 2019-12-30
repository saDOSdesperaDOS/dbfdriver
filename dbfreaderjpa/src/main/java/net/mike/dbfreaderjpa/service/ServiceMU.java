package net.mike.dbfreaderjpa.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

import net.mike.dbfreaderjpa.entyties.MU;

public class ServiceMU {
	
	EntityManager em = Persistence.createEntityManagerFactory("PersistenceUnit").createEntityManager();
	
	public List<MU> getBalance() {
		Query query = em.createNativeQuery("select * from MU", MU.class);
		query.setParameter(1, "%ID%");
		return  query.getResultList();
	}
}
