package it.uniroma3.modelli;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;


	@Entity
	public class Prodotto {
        
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	private Float costo;
	@Column(length = 2000)

	private String descrizione;
	private Date dataTerminazione;

	@Column(nullable = false)
	private String codice;


	
	
	public Prodotto() {
		
	}


	public Prodotto(String nome,String codice,Float costo){
		this.nome=nome;
		this.codice=codice;
		this.costo=costo;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCodice() {
		return codice;
	}


	public void setCodice(String codice) {
		this.codice = codice;
	}


	public Float getCosto() {
		return costo;
	}


	public void setCosto(Float costo) {
		this.costo = costo;
	}

	public Date getData() {
		return dataTerminazione;
	}


	public void setData(Date data) {
		this.dataTerminazione = data;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codice == null) ? 0 : codice.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Prodotto other = (Prodotto) obj;
		if (codice == null) {
			if (other.codice != null)
				return false;
		} else if (!codice.equals(other.codice))
			return false;
		return true;
	}

}
