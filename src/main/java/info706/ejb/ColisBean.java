package info706.ejb;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import info706.jpa.Colis;

@Stateless
@LocalBean
public class ColisBean implements IColis {
	@PersistenceContext
	private EntityManager em;
	
	public ColisBean() {
	}

	@Override
	public Colis registerColis(double poids, double valeur, double latitude, double longitude, String origine,
						  String destination, String emplacement, String etat)
	{
		Colis c = new Colis(poids, valeur, latitude, longitude, origine, destination, emplacement, etat);
		em.persist(c);
		return c;
	}

	@Override
	public Colis getColis(long id) {
		return em.find(Colis.class, id);
	}

	@Override
	public List<Colis> getAllColis() {
		Query req = em.createQuery("SELECT col FROM Colis col");
		return req.getResultList();
	}

	@Override
	public Colis updateColis(long id, double latitude, double longitude, String emplacement, String etat) {
		Colis c = em.find(Colis.class, id);
		c.setLatitude(latitude);
		c.setLongitude(longitude);
		c.setEmplacement(emplacement);
		c.setEtat(etat);
		return c;
	}
}
