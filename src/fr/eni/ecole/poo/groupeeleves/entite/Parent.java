package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.Date;

public class Parent extends Personne implements Responsable {

	public Parent() {
		super();
	}
	
	public Parent(String nom, String prenom, String adresse, Date ddn) {
		super(nom, prenom, adresse, ddn);
	}

	@Override
	public String getNiveau() {
		return "assistant";
	}
}
