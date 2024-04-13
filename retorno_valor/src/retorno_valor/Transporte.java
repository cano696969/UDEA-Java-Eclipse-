package retorno_valor;

public class Transporte {

	
	int precio =0;
	
	public  Transporte(int precio) {
		System.out.println("se creo un objeto transporte");
	this.precio = precio;
	
	
}
	
	
	public int precio() {
		
		
		
		this.precio++;
		return this.precio;
	}
}
