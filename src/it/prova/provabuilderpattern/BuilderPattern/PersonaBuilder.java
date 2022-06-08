package it.prova.provabuilderpattern.BuilderPattern;

import it.prova.provabuilderpattern.model.Persona;

public class PersonaBuilder {
	private Long id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private Integer numeroDiTelefono;
	private Integer eta;
	
	private PersonaBuilder(Long id) {
		this.id = id;
	}
	
	public static PersonaBuilder newBuilder(Long id) {
		return new PersonaBuilder(id);
	}
	
	public PersonaBuilder nome (String nome) {
		this.nome = nome;
		return this;
	}
	
	public PersonaBuilder cognome(String cognome) {
		this.cognome = cognome;
		return this;
	}
	
	public PersonaBuilder indirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
		return this;
	}
	
	public PersonaBuilder numeroDiTelefono(Integer numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
		return this;
	}
	
	public PersonaBuilder eta(Integer eta) {
		this.eta = eta;
		return this;
	}
	
	public Persona build() {
		return new Persona(id, nome, cognome, indirizzo, numeroDiTelefono, eta);
	}
}
