package it.rubrica.business;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import it.rubrica.data.Contatto;

/**
 * Session Bean implementation class RubricaEJB
 */
@Stateless
public class RubricaEJB implements RubricaEJBRemote, RubricaEJBLocal {
	@PersistenceContext(unitName = "rubricaPersistenceUnit")
	EntityManager em;

	public RubricaEJB() {

	}

	public void addContatto(Contatto c) {
		em.persist(c);
	}

	public void updateContatto(Contatto c) {
		em.merge(c);
	}

	public void removeContatto(Contatto c) {
		em.remove(c);
	}

	public Contatto getContatto(Integer id) {
		return em.find(Contatto.class, id);
		 
	}

	public List<Contatto> getContatti(){
		Query q = em.createQuery("SELECT c FROM Contatto c");
		return q.getResultList();
	}
//secondo commit di prova


}
