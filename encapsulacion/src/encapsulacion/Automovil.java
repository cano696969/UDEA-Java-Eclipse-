package encapsulacion;

public class Automovil {
	
	// Atributos
	int precio;
	String marca;
	
	//Constructor
	public Automovil() {
		System.out.println("Se  a  creado un objeto de  tipo automovil: ");

	}

	//metodos getter 
	
	public int getPrecio() {
		return this.precio;

	}

	public String getMarca() {
		return this.marca;
	}

	//metodos set 
	
	public void setPrecio(int p) {
	this.precio = p;
	}
	
	
	
	public void setMarca(String m ) {
	this.marca = m;
	}
	
	
	
}
