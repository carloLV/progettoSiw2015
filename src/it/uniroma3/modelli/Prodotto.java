package it.uniroma3.modelli;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Column;



@Entity
//@NamedQuery(name = "findAllProducts", query = "SELECT p FROM Product p")
public class Prodotto{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(nullable = false)
	private String nome;

	private Float prezzo;
	@Column(length = 2000)

	private String descrizione;

	Prodotto() {
	}

	Prodotto(String nome, Float prezzo, String descrizione, String codice) {
		this.nome = nome;
		this.prezzo = prezzo;
		this.descrizione = descrizione;
	}


	//getter e setter

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(Float prezzo) {
		this.prezzo = prezzo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public boolean equals(Object obj) {
        Prodotto p = (Prodotto)obj;
        return this.id.equals(p.getId());
    }

    public int hashCode() {
         return this.id.hashCode();
    }



}