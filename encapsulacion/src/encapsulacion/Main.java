package encapsulacion;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			Automovil auto = new Automovil();
			auto.setMarca("Lamborgini");
			System.out.println("El auto es de marca:" + auto.getMarca());
			
			auto.setPrecio(100000);
			System.out.println("El precio del auto es de" + auto.getPrecio());

	}

}
