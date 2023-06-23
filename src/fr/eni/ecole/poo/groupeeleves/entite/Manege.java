package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.ArrayList;
import java.util.List;

public class Manege <T>{
	private String nom;
	private List<T> lstParticipants = new ArrayList<T>();
	
	public Manege() {
		super();
	}

	public Manege(String nom) {
		super();
		this.nom = nom;
	}
	
	public void addParticipant(T participant) {
		lstParticipants.add(participant);
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<T> getLstParticipants() {
		return lstParticipants;
	}

	public void setLstParticipants(List<T> lstParticipants) {
		this.lstParticipants = lstParticipants;
	}

	public String toString() {
		return "Manège :"+this.nom+" => "+lstParticipants.size()+" occupants";
	}
}
