package it.uniroma3.modelli;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Ordine {
	
	private String richiedente;
	
	private List<RigaOrdine> righeOrdine = new ArrayList<RigaOrdine>();
	
	private Date dataApertura;
	
	private Date dataChiusura;
	
	private Date dataEvasione;
	
	public Ordine(){
		
	}
	
	
	
	public String getRichiedente() {
		return richiedente;
	}



	public void setRichiedente(String richiedente) {
		this.richiedente = richiedente;
	}



	public List<RigaOrdine> getRigheOrdine() {
		return righeOrdine;
	}



	public void setRigheOrdine(List<RigaOrdine> righeOrdine) {
		this.righeOrdine = righeOrdine;
	}



	public Date getDataApertura() {
		return dataApertura;
	}



	public void setDataApertura(Date dataApertura) {
		this.dataApertura = dataApertura;
	}



	public Date getDataChiusura() {
		return dataChiusura;
	}



	public void setDataChiusura(Date dataChiusura) {
		this.dataChiusura = dataChiusura;
	}



	public Date getDataEvasione() {
		return dataEvasione;
	}



	public void setDataEvasione(Date dataEvasione) {
		this.dataEvasione = dataEvasione;
	}



	public void aggiungiRigaOrdine(RigaOrdine ro){
		this.righeOrdine.add(ro);
	}
}
