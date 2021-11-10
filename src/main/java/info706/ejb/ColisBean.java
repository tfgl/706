package info706.ejb;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import info706.jpa.Colis;

@Stateless
@LocalBean
public class ColisBean implements IColis {
	@PersistenceContext
	private EntityManager em;
	
	public ColisBean() {
	}
	
	public Colis registerColis(double poids, double valeur, double latitude, double longitude, String origine,
						  String destination, String emplacement, String etat)
	{
		Colis c = new Colis(poids, valeur, latitude, longitude, origine, destination, emplacement, etat);
		em.persist(c);
		return c;
	}

	public Colis getColis(long id) {
		return em.find(Colis.class, id);
	}

	@Override
	public Colis updateColis(long id) {
		Colis c = em.find(Colis.class, id);
		return c;
	}
}
