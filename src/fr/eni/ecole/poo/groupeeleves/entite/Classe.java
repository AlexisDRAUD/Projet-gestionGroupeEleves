package fr.eni.ecole.poo.groupeeleves.entite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Classe extends Personne {

	private String nom;
	private Instituteur instituteur;
	private List<Eleve> lstEleves = new ArrayList<Eleve>();

	public Classe() {
		super();
	}
	
	public Classe(String nom) {
		this.nom = nom;
	}
	
	public void addEleve(Eleve e) {
		this.lstEleves.add(e);
	}
	
	public void removeEleve(Eleve e) {
		this.lstEleves.remove(e);
	}
	
	public Eleve getEleve(int i) throws ClasseException{
		Eleve e;
		try {
			e = this.lstEleves.get(i);
		} catch(IndexOutOfBoundsException ex) {
			throw new ClasseException("La classe ne contient que "+this.lstEleves.size()+" élèves");
		}
		return e;
	}
	
	public void sortListEleve() {
		Collections.sort(lstEleves);
	}
	
	public List<Eleve> getLstEleves() {
		return lstEleves;
	}

	public void setLstEleves(List<Eleve> lstEleves) {
		this.lstEleves = lstEleves;
	}

	public List<Parent> getListParent() {
		List<Parent> lstParents = new ArrayList<Parent>();
		for(Eleve e : lstEleves)
		{
			if((!(lstParents.contains(e.getReferent())))&&(e.getReferent()!=null)) {
				lstParents.add(e.getReferent());
			}
		}
		return lstParents;
	}
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Instituteur getInstituteur() {
		return instituteur;
	}

	public void setInstituteur(Instituteur instituteur) {
		this.instituteur = instituteur;
	}

	@Override
	public String toString() {
		StringBuffer sbLstEleves = new StringBuffer();
		for(Eleve e : lstEleves) {
			sbLstEleves.append("     "+e.getPrenom()+" "+e.getNom()+"\n");
		}
		return  "---------------------------------------------------\n"+
				"Classe : "+nom+"\n"+
				"   Instituteur : "+instituteur.getPrenom()+" "+instituteur.getNom()+"\n"+
				"     avec :\n"+
				sbLstEleves+
				"---------------------------------------------------";
	}
}
