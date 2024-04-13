

package area;

import java.util.*;

public class areadecirculo {

	public areadecirculo() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		
		System.out.print("Introduce el radio:");
		double r= s.nextDouble();
		double area=(22*r*r)/7;
		System.out.print("Area del circulo es:" +area);
	}

}
