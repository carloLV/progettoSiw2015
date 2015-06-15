<<<<<<< HEAD
package it.uniroma3.modelli;

import javax.persistence.Entity;

@Entity
public class Amministratore extends Dipendente{

	public Amministratore(String email, String pwd) {
		super(email, pwd);
		// TODO Auto-generated constructor stub
	}
	public Amministratore(){
		
	}
	
//	@Override
//	public void confermaOrdine(Ordine o){
//		o.setRichiedente(this.getEmail());
//		
//	}

}
=======
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
>>>>>>> 1d86202cadf5eec1730b820454b71729a2580f0b
