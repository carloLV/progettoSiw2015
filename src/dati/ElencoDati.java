package dati;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ElencoDati {
	
	private Map<String,Dipendente> utenti= new HashMap<String,Dipendente>();
	
	private Set<Ordine> ordini=new HashSet<Ordine>();//la lista deve essere oridnata in base alla data di inserimento
	
	private Map<String,Fornitore> fornitori= new HashMap<String,Fornitore>();
	
	private Ordine ordineCorrente;
	
	private Dipendente dipendenteCorrente;

	//metodi autogenerati
	public Map<String, Dipendente> getUtenti() {
		return utenti;
	}

	public void setUtenti(Map<String, Dipendente> utenti) {
		this.utenti = utenti;
	}

	public Set<Ordine> getOrdini() {
		return ordini;
	}

	public void setOrdini(Set<Ordine> ordini) {
		this.ordini = ordini;
	}

	public Map<String, Fornitore> getFornitori() {
		return fornitori;
	}

	public void setFornitori(Map<String, Fornitore> fornitori) {
		this.fornitori = fornitori;
	}
	
	//fine metodi autogenerati
	//-------------------------------------------------

	public void mostraFornitori(){
		for (Fornitore f: this.fornitori.values()){
			System.out.println("Elenco Fornitori:");
			System.out.println(f.toString() + "/n");
		}
		
		public void mostraUtenti(){
			for (Dipendente f: this.utenti.values()){
				System.out.println("Elenco Utenti:");
				System.out.println(f.toString() + "/n");
			}
			
	}
}
