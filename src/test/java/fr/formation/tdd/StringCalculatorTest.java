package fr.formation.tdd;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

	@Test
	public void doitRenvoyer0SiChaineVide() {

		assertEquals(0, StringCalculator.add(""));
	}

	@Test
	public void doitRenvoyer1SiChaine1() {

		assertEquals(1, StringCalculator.add("1"));
	}

	@Test
	public void doitRenvoyer2SiChaine2() {

		assertEquals(2, StringCalculator.add("2"));
	}

	@Test
	public void doitRenvoyerSommeDeDeuxNombresSeparesParVirgule() {

		assertEquals(8, StringCalculator.add("2,6"));
	}

	@Test
	public void doitRenvoyerSommeDesNombresSeparesParVirgule() {

		assertEquals(18, StringCalculator.add("2,6,9,1"));
	}

	@Test
	public void doitAccepterUnDelimiterCustom() {

		assertEquals(16, StringCalculator.add("//;\n6;9;1"));
	}
	
}
