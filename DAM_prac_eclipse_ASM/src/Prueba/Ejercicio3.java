package Prueba;
import java.util.*;
public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado= new Scanner(System.in);	

		String nombre = "";
		int edad = 0;
		double peso = 0;
		double altura = 0;
		String sexo = "";	
		double velocidad=0;
		double distancia=0;
		double calorias=0;
		double sumaVelocidades = 0;
		double sumaDistancias = 0;
		double sumaCalorias = 0;
		double maximaDistancia = 0;
		double maximasCalorias = 0;
		double mediaVelocidades=0;
		double mediaDistancias=0;
		double mediaCalorias=0;

		System.out.println("¿Cuál es tu nombre?");
		nombre=teclado.nextLine();
		System.out.println("¿Cuál es tu edad?");	
		edad=teclado.nextInt();
		System.out.println("¿Cuál es tu peso en kg?");
		peso=teclado.nextDouble();
		System.out.println("¿Cuál es tu altura en cm?");
		altura=teclado.nextDouble();
		teclado.nextLine();
		System.out.println("¿Cuál es tu sexo?");
		sexo=teclado.nextLine();
		double IMC=(peso/(altura*altura/10000));
		System.out.print("Velocidad inicial (km/h): ");
		velocidad = teclado.nextDouble();

		System.out.print("Distancia inicial (km): ");
		distancia= teclado.nextDouble();

		System.out.print("Calorías quemadas iniciales: ");
		calorias = teclado.nextDouble();

		for (int i = 1; i <= 10; i++) {
			System.out.println("\nIntroduce los datos de la sesión " + i + ":");

			System.out.print("Velocidad (km/h): ");
			velocidad = teclado.nextDouble();

			System.out.print("Distancia (km): ");
			distancia = teclado.nextDouble();

			System.out.print("Calorías quemadas: ");
			calorias = teclado.nextDouble();
		}
		sumaVelocidades += velocidad;
		sumaDistancias += distancia;
		sumaCalorias += calorias;
		if (distancia > maximaDistancia) {
			maximaDistancia = distancia;
		}
		if (calorias > maximasCalorias) {
			maximasCalorias = calorias;
		}
		mediaVelocidades = sumaVelocidades / 10;
		mediaDistancias = sumaDistancias / 10;
		mediaCalorias = sumaCalorias / 10;


		System.out.println("Hola "+nombre +", te presentamos la ficha de seguimiento de entrenamiento\n");
		System.out.println("Edad: "+edad +"\nPeso: "+peso+"\nAltura: "+altura+"\nSexo: "+sexo+"\nÍndice de masa corporal: "+String.format("%.2f", IMC)+"\n");
		System.out.println("La media de entrenamiento en 10 sesiones es: ");
		System.out.println("Velocidad: " + String.format("%.2f", mediaVelocidades) + " km/h");
		System.out.println("Distancia recorrida: " + String.format("%.2f", mediaDistancias) + " km");
		System.out.println("Calorías quemadas: " + String.format("%.2f", mediaCalorias));
		System.out.println("Máxima distancia recorrida: " + String.format("%.2f", maximaDistancia) + " km");
		System.out.println("Máximo número de calorías quemadas en una sesión: " + String.format("%.2f", maximasCalorias));

		boolean superaMedia = false;
		if (mediaVelocidades > velocidad) {
			System.out.println("¡Enhorabuena! Has superado tu velocidad media inicial.");
			superaMedia = true;
		}
		if (mediaDistancias > distancia) {
			System.out.println("¡Enhorabuena! Has superado tu distancia media inicial.");
			superaMedia = true;
		}
		if (mediaCalorias > calorias) {
			System.out.println("¡Enhorabuena! Has superado tus calorías quemadas medias iniciales.");
			superaMedia = true;
		}

		if (!superaMedia) {
			System.out.println("¡Sigue entrenando para superar tus marcas iniciales!");
		}

		teclado.close();	
	}
}