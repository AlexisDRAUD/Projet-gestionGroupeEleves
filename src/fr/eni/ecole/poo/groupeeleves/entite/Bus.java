package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.ArrayList;
import java.util.List;

public class Bus {

	private int nbPlaceMax;
	private List<Personne> lstPersonnes = new ArrayList<Personne>();

	public Bus() {
		super();
	}

	public Bus(int nbPlaceMax) {
		super();
		this.nbPlaceMax = nbPlaceMax;
	}

	public int getNbPlaceMax() {
		return nbPlaceMax;
	}

	public void setNbPlaceMax(int nbPlaceMax) {
		this.nbPlaceMax = nbPlaceMax;
	}

	public List<Personne> getLstPersonnes() {
		return lstPersonnes;
	}

	public void setLstPersonnes(List<Personne> lstPersonnes) {
		this.lstPersonnes = lstPersonnes;
	}

	public void addPersonne(Personne p) throws BusException {
		if (this.lstPersonnes.size() < this.nbPlaceMax) {
			this.lstPersonnes.add(p);
		} else {
			throw new BusException("Le bus est plein " + p.getPrenom() + " " + p.getNom() + " ne peut pas partir");
		}
	}

	public void afficherResponsables() {
		for (Personne p : this.lstPersonnes) {
			if (p instanceof Instituteur) {
				System.out.println(((Instituteur)p).getPrenom() + " " + ((Instituteur)p).getNom() + " Responsable " + ((Instituteur)p).getNiveau());
			}
			if (p instanceof Parent) {
				System.out.println(((Parent)p).getPrenom() + " " + ((Parent)p).getNom() + " Responsable " + ((Parent)p).getNiveau());
			}
		}
	}
}
