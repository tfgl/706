package com.example.jpa;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;


@Entity
public class Colis implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id @GeneratedValue
	private long id;
	
	private double poids,
				   valeur,
				   latitude,
				   longitude;
	
	private String origine,
				   destination,
				   emplacement,
				   etat;
	
	public Colis(double poids, double valeur, double latitude, double longitude, String origine,
			String destination, String emplacement, String etat) {
		super();
		this.poids = poids;
		this.valeur = valeur;
		this.latitude = latitude;
		this.longitude = longitude;
		this.origine = origine;
		this.destination = destination;
		this.emplacement = emplacement;
		this.etat = etat;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public double getPoids() {
		return poids;
	}


	public void setPoids(double poids) {
		this.poids = poids;
	}


	public double getValeur() {
		return valeur;
	}


	public void setValeur(double valeur) {
		this.valeur = valeur;
	}


	public double getLatitude() {
		return latitude;
	}


	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}


	public double getLongitude() {
		return longitude;
	}


	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}


	public String getOrigine() {
		return origine;
	}


	public void setOrigine(String origine) {
		this.origine = origine;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getEmplacement() {
		return emplacement;
	}


	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}


	public String getEtat() {
		return etat;
	}


	public void setEtat(String etat) {
		this.etat = etat;
	}

}
