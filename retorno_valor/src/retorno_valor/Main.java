package retorno_valor;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Transporte t = new Transporte(5000);
			int valor =0;
			valor = t.precio;
			System.out.println("La funcion devolvio el valor: "+ valor);
	}

}
