package main;

/**
 * 
 * @author geovannydev
 *
 */

public class Main {

	public static void main(String[] args) {
		
		//Primera parte
		FuncionSuma sumar = new FuncionSuma(); 
		
		int resultado = sumar.suma(10, 20, 30);
		
		System.out.println("El resultado de la suma es: " + resultado);
		
		//Segunda parte
		Coche miCoche = new Coche();
		
		int numeroDePuertas = miCoche.incrementarPuerta();
		
		System.out.println("El Objeto miCoche tiene " + numeroDePuertas + " puertas.");
		
		
	}

}
