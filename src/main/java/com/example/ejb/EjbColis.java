package com.example.ejb;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.example.jpa.Colis;

@Stateless
@LocalBean
public class EjbColis {
	@PersistenceContext
	private EntityManager manager;
	
	public EjbColis() {
	}
	
	public Colis register(double poids, double valeur, double latitude, double longitude, String origine,
						  String destination, String emplacement, String etat)
	{
		Colis colis = new Colis(poids, valeur, latitude, longitude, origine, destination, emplacement, etat);
		manager.persist(colis);
		return colis;
	}

}
