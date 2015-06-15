package it.uniroma3.modelli;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;

@Entity
@NamedQuery(name="getTuttiFornitori", query= "SELECT f FROM Fornitore f")
public class Fornitore {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(nullable=false)
	private String partitaIva;
	
	@Column(nullable=false)
	private String indirizzo;
	
	@Column(nullable=false)
	private String telefono;
	
	@Column(nullable=false)
	private String email;
	
	public Fornitore() {}
	

	public Fornitore(String partitaIva, String email) {
		super();
		this.partitaIva = partitaIva;
		this.indirizzo = indirizzo;
		this.telefono = telefono;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPartitaIva() {
		return partitaIva;
	}

	public void setPartitaIva(String partitaIva) {
		this.partitaIva = partitaIva;
	}

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
