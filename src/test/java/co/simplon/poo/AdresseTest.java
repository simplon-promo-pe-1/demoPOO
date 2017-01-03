package co.simplon.poo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AdresseTest {

	@Test
	public void si_adresses_identiques_en_memoire_alors_equals_true() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = adresse1;

		boolean comparaison1 = adresse1.equals(adresse2);
		boolean comparaison2 = adresse2.equals(adresse1);

		assertTrue(comparaison1);
		assertTrue(comparaison2);
	}

	@Test
	public void si_adresses_distinctes_en_memoire_mais_identiques_alors_equals_true() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");

		boolean comparaison = adresse1.equals(adresse2);

		assertTrue(comparaison);
	}

	@Test
	public void si_adresses_differentes_alors_equals_false() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = new Adresse(2, "rue des lilas", 92100, "Courbevoie");

		boolean comparaison1 = adresse1.equals(adresse2);
		boolean comparaison2 = adresse2.equals(adresse1);
		
		assertFalse(comparaison1);
		assertFalse(comparaison2);
	}

	@Test
	public void comparaison_adresse_non_null_avec_null_equals_false() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = null;
		
		boolean comparaison = adresse1.equals(adresse2);
		
		assertFalse(comparaison);
	}
	
	@Test
	public void adresses_distinctes_en_memoire_hashcode_identique() {
		Adresse adresse1 = new Adresse(1, "rue des lilas", 92100, "Courbevoie");
		Adresse adresse2 = new Adresse(1, "rue des lilas", 72100, "Courbevoie");

		int hashcodeAdresse1 = adresse1.hashCode();
		int hashcodeAdresse2 = adresse2.hashCode();
		
		assertEquals(hashcodeAdresse1, hashcodeAdresse2);
	}
	
}
