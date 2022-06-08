package it.prova.provabuilderpattern.model;

public class Persona {

	private Long id;
	private String nome;
	private String cognome;
	private String indirizzo;
	private Integer numeroDiTelefono;
	private Integer eta;
	
	public Persona(Long id, String nome, String cognome, String indirizzo, Integer numeroDiTelefono, Integer eta) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
		this.numeroDiTelefono = numeroDiTelefono;
		this.eta = eta;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getIndirizzo() {
		return indirizzo;
	}
	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}
	public Integer getNumeroDiTelefono() {
		return numeroDiTelefono;
	}
	public void setNumeroDiTelefono(Integer numeroDiTelefono) {
		this.numeroDiTelefono = numeroDiTelefono;
	}
	public Integer getEta() {
		return eta;
	}
	public void setEta(Integer eta) {
		this.eta = eta;
	}
	
	public String toString() {
		return "Persona[ID= "+id+", Nome= "+nome+", Cognome= "+cognome+", Indirizzo= "+indirizzo+", Numero Di Telefono= "+numeroDiTelefono+", Eta'= "+eta+"]";
	}
	
}
