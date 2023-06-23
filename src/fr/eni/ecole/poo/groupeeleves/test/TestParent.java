package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Parent;

class TestParent {

	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private String nom;
	private String prenom;
	private String adresse;
	private Date ddn;

	@BeforeEach
	void setUp() throws ParseException {
		nom = "Duchemin";
		prenom = "Remi";
		adresse = "31 impasse Bacot 35000 Rennes";
		ddn = sdf.parse("20/05/2010");
	}
	
	@Test
	void testDefaultConstructor() {
		Parent par = new Parent();
		assertNotNull(par);
		}

	@Test
	void testConstructorUsingFields() {
		Parent par = new Parent(nom, prenom, adresse, ddn);

		assertNotNull(par);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);

		assertEquals(nom, par.getNom());
		assertEquals(prenom, par.getPrenom());
		assertEquals(adresse, par.getAdresse());
		assertEquals(ddn, par.getDdn());
	}

	@Test
	void testSetters() {
		Parent par = new Parent();
		par.setNom(nom);
		par.setPrenom(prenom);
		par.setAdresse(adresse);
		par.setDdn(ddn);

		assertNotNull(par);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);

		assertEquals(nom, par.getNom());
		assertEquals(prenom, par.getPrenom());
		assertEquals(adresse, par.getAdresse());
		assertEquals(ddn, par.getDdn());
	}

}
