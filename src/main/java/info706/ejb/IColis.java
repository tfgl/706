package info706.ejb;

import java.util.List;

import info706.jpa.Colis;

public interface IColis {
	Colis registerColis(double poids, double valeur, double latitude, double longitude, String origine,
						  String destination, String emplacement, String etat);
	Colis getColis(long id);
	Colis updateColis(long id, double latitude, double longitude, String emplacement, String etat);
	void deleteColis(long id);
	List<Colis> getAllColis();
}
