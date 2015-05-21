package it.uniroma3.modelli;

public class Amministratore extends Dipendente{

	public Amministratore(String email, String pwd) {
		super(email, pwd);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void confermaOrdine(Ordine o){
		o.setRichiedente(this.getEmail());
		
	}

}
