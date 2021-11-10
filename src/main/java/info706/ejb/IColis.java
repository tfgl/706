package info706.ejb;

import info706.jpa.Colis;

public interface IColis {
	Colis registerColis(double poids, double valeur, double latitude, double longitude, String origine,
						  String destination, String emplacement, String etat);
	Colis getColis(long id);
	Colis updateColis(long id);
}
