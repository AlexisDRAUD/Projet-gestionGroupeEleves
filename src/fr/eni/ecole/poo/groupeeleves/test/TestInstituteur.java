package fr.eni.ecole.poo.groupeeleves.test;

import static org.junit.jupiter.api.Assertions.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fr.eni.ecole.poo.groupeeleves.entite.Instituteur;

class TestInstituteur {

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
		Instituteur i = new Instituteur();
		assertNotNull(i);
		}
	
	@Test
	void testConstructorUsingFields() {
		Instituteur i = new Instituteur(nom, prenom, adresse, ddn);

		assertNotNull(i);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);

		assertEquals(nom, i.getNom());
		assertEquals(prenom, i.getPrenom());
		assertEquals(adresse, i.getAdresse());
		assertEquals(ddn, i.getDdn());
	}
	
	@Test
	void testSetters() {
		Instituteur i = new Instituteur();
		i.setNom(nom);
		i.setPrenom(prenom);
		i.setAdresse(adresse);
		i.setDdn(ddn);

		assertNotNull(i);
		assertNotNull(nom);
		assertNotNull(prenom);
		assertNotNull(adresse);
		assertNotNull(ddn);

		assertEquals(nom, i.getNom());
		assertEquals(prenom, i.getPrenom());
		assertEquals(adresse, i.getAdresse());
		assertEquals(ddn, i.getDdn());
	}

}
