/**
 * 
 */
/**
 * 
 */
module éjercicio1 {
	

    public void encender() {
        if (estado == false) {
            System.out.println("El coche se ha encendido");
            estado = true;
        } else {
            System.out.println("El coche ya está encendido");
        }
    }

    public void apagar() {
        if (estado == true) {
            System.out.println("El coche se ha apagado");
            estado = false;
        } else {
            System.out.println("El coche ya está apagado");
        }
    }

    public void avanzar() {
        if (estado == true) {
            System.out.println("El coche está avanzando");
        } else {
            System.out.println("El coche no puede avanzar");
        }
    }

	
}



