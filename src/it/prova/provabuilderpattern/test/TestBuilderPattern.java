package it.prova.provabuilderpattern.test;

import it.prova.provabuilderpattern.BuilderPattern.PersonaBuilder;
import it.prova.provabuilderpattern.model.Persona;

public class TestBuilderPattern {

	public static void main(String[] args) {

		Persona personaTest = PersonaBuilder.newBuilder(1L).nome("Alessio").cognome("Conti").indirizzo("Via Mosca, 52")
				.numeroDiTelefono(22).eta(20).build();
		
		System.out.println(personaTest);
	}

}
