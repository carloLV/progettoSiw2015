package dati;

public class RigaOrdine {
	
	private Prodotto prod;
	
	private int quantity;
	
	private float costoUnitario;
	
	private float costo;
	
	public RigaOrdine() {
	}
	
	public RigaOrdine(Prodotto prod, int quantity){
		this.prod=prod;
		this.quantity=quantity;
		this.costoUnitario=prod.getCosto();
		this.costo=this.costoUnitario*this.quantity;		
	}

	public Prodotto getProd() {
		return prod;
	}

	public void setProd(Prodotto prod) {
		this.prod = prod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}
	
	

}
