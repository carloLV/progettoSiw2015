package dati;

import java.util.Date;

public class Prodotto {
	String nome;
	String codice;
	Float costo;
	Float quantita;
	Date dataTerminazione;


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


	public Float getQuantita() {
		return quantita;
	}


	public void setQuantita(Float quantita) {
		this.quantita = quantita;
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
