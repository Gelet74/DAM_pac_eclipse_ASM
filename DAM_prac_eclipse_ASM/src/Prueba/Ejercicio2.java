package Prueba;
import java.util.*;
public class Ejercicio2 {
	public static Scanner teclado= new Scanner (System.in);
	public static void main(String[] args) {


		if (procesoSeleccion()) {
			System.out.println("Felicidades, has pasado el proceso de selecci�n.");
		} else {
			System.out.println("Lo sentimos, no has pasado el proceso de selecci�n.");
		}
	}

	public static boolean procesoSeleccion() {

		int edad=0;
		double sueldo=0;
		int nom=0;
		int sum_nom=0;

		System.out.print("Por favor, ingresa tu edad: ");
		edad = teclado.nextInt();



		if (edad > 40) {
			System.out.println("Edad mayor a 40, descartado del proceso de selecci�n.");
			return false;
		}


		System.out.print("Por favor, ingresa tu sueldo bruto del a�o anterior: ");
		sueldo = teclado.nextDouble();



		if (sueldo > 30000) {
			System.out.println("Sueldo mayor a 30,000, descartado del proceso de selecci�n.");
			return false;

		}

		System.out.println("Introduce tus �ltimas 5 n�minas:");
		for (nom = 1; nom <= 5; nom++) {
			System.out.print("N�mina N� " + nom + ": ");
			sum_nom += teclado.nextInt();
		}

		System.out.println("Suma total de las n�minas: " + sum_nom);
		System.out.println("La media de las 5 �ltimas n�minas, es: "+(sum_nom/5));
		double med_nom= sum_nom/5;

		if (med_nom>2500) {
			System.out.println("Tienes un aumento del 5%");	
			System.out.println("Tu nuevo sueldo es: "+((med_nom+(med_nom-med_nom*0.95))));
		}
		else {
			System.out.println("Tienes un aumento del 10%");	
			System.out.println("Tu nuevo sueldo es: "+((med_nom+(med_nom-med_nom*0.9))));
		}

		return true;

	}

}