package it.uniroma3.controller;

import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import it.uniroma3.modelli.*;



@ManagedBean
public class ControllerProdotto {
	
	@ManagedProperty(value="#{param.id}")
	private Long id;
	private String nome;
	private Float prezzo;
	private String descrizione;
	private Prodotto prodotto;
	private List<Prodotto> prodotti;
	
	@EJB(name="facadeP")
	private FacadeProdotto facadeProdotto;
	
	public String creaProdotto() {
		this.prodotto = facadeProdotto.creaProdotto(nome, prezzo, descrizione);
		return("operazioneEffettuata.jsp");
	
	//else return ("Error.jsp"); 
	}
	
	public String listProdotti() {
		this.prodotti = facadeProdotto.getAllProdotti();
		return "prodotti"; 
	}

	public String findProdotto() {
		this.prodotto = facadeProdotto.getProdotto(id);
		return "prodotto";
	}
	
	public String findProdotto(Long id) {
		this.prodotto = facadeProdotto.getProdotto(id);
		return "prodotto";
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

	public Prodotto getProdotto() {
		return prodotto;
	}

	public void setProdotto(Prodotto prodotto) {
		this.prodotto = prodotto;
	}

	public List<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(List<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

}


