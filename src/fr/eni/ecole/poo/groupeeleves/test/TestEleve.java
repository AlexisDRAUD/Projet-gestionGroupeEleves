package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Eleve;
import fr.eni.ecole.poo.groupeeleves.entite.Parent;

class TestEleve {
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;
	private String nomRef;
	private String prenomRef;
	private String adresseRef;
	private Date ddnRef;

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Duchemin";
		prenom = "Remi";
		adresse = "31 impasse Bacot 35000 Rennes";
		ddn = sdf.parse("20/05/2010");
		nomRef = "Ducheminot";
		prenomRef = "Laurent";
		adresseRef = "30 impasse Bacot 35000 Rennes";
		ddnRef = sdf.parse("26/06/1980");
	}

	@Test
	void testDefaultConstructor() {
		Eleve e = new Eleve();
		assertNotNull(e);
		}
	
	@Test
	void testConstructorUsingFields() {
		Eleve e = new Eleve(nom, prenom, adresse, ddn);

		assertNotNull(e);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);

		assertEquals(nom, e.getNom());
		assertEquals(prenom, e.getPrenom());
		assertEquals(adresse, e.getAdresse());
		assertEquals(ddn, e.getDdn());
		
	}
	
	@Test
	void testSetters() {
		Parent referent = new Parent(nomRef, prenomRef, adresseRef, ddnRef);
		Eleve e = new Eleve();
		e.setNom(nom);
		e.setPrenom(prenom);
		e.setAdresse(adresse);
		e.setDdn(ddn);
		e.setReferent(referent);

		assertEquals(nom, e.getNom());
		assertEquals(prenom, e.getPrenom());
		assertEquals(adresse, e.getAdresse());
		assertEquals(ddn, e.getDdn());
		assertEquals(referent, e.getReferent());
	}
	
	@Test
	void testReferent() {
		Parent referent = new Parent(nomRef, prenomRef, adresseRef, ddnRef);
		Eleve e = new Eleve();
		e.setReferent(referent);

		Parent p_e = e.getReferent();
		assertNotNull(p_e);
		assertNotNull(nomRef);
		assertNotNull(prenomRef);
		assertNotNull(adresseRef);
		assertNotNull(ddnRef);

		assertEquals(nomRef, p_e.getNom());
		assertEquals(prenomRef, p_e.getPrenom());
		assertEquals(adresseRef, p_e.getAdresse());
		assertEquals(ddnRef, p_e.getDdn());
	}
	
	@Test
	void testCompareToEquals() {
		Eleve e = new Eleve(nom, "Remi", adresse, ddn);
		Eleve e1 = new Eleve(nomRef, "Remi", adresseRef, ddnRef);
		
		assertEquals(0, e1.compareTo(e));
		assertEquals(0, e.compareTo(e1));
	}
	
	@Test
	void testCompareToPositive() {
		Eleve e = new Eleve(nom, "Remi", adresse, ddn);
		Eleve e1 = new Eleve(nomRef, "Laurent", adresseRef, ddnRef);
		
		assertTrue(e.compareTo(e1)>0);
		assertTrue(e1.compareTo(e)<0);
	}
	
	@Test
	void testCompareToNegative() {
		Eleve e = new Eleve(nom, "Laurent", adresse, ddn);
		Eleve e1 = new Eleve(nomRef, "Remi", adresseRef, ddnRef);
		
		assertTrue(e.compareTo(e1)<0);
		assertTrue(e1.compareTo(e)>0);
	}
}
