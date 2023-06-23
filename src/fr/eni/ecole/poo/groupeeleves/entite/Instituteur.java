package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.Date;

public class Instituteur extends Personne implements Responsable {

	public Instituteur() {
		super();
	}
	
	public Instituteur(String nom, String prenom, String adresse, Date ddn) {
		super(nom, prenom, adresse, ddn);
	}

	@Override
	public String getNiveau() {
		return "principal";
	}
	
}
