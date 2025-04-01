package Prueba;
import java.util.*;


public class Ejercicio4 {

    public static void main(String[] args) {
       
        String[] arrayNombres = new String[20];
        int[] arrayPuntuacion = new int[20];

        
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Introduce el nombre de los 20 equipos:");
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.print("Equipo " + (i + 1) + ": ");
            arrayNombres[i] = teclado.nextLine();
        }

        
        Random random = new Random();
        for (int i = 0; i < arrayPuntuacion.length; i++) {
            arrayPuntuacion[i] = random.nextInt(66) + 35; 
        }

       
        System.out.println("\nEquipos y sus puntuaciones:");
        for (int i = 0; i < arrayNombres.length; i++) {
            System.out.println(arrayNombres[i] + " - Puntuación: " + arrayPuntuacion[i]);
        }

        int maxPuntos = arrayPuntuacion[0];
        int minPuntos = arrayPuntuacion[0];
        int indexMax = 0;
        int indexMin = 0;
        int sumaPuntos = 0;

        for (int i = 0; i < arrayPuntuacion.length; i++) {
            sumaPuntos += arrayPuntuacion[i];

            if (arrayPuntuacion[i] > maxPuntos) {
                maxPuntos = arrayPuntuacion[i];
                indexMax = i;
            }

            if (arrayPuntuacion[i] < minPuntos) {
                minPuntos = arrayPuntuacion[i];
                indexMin = i;
            }
        }

        
        double puntuacionMedia = (double) sumaPuntos / arrayPuntuacion.length;

        
        System.out.println("\nEquipo ganador: " + arrayNombres[indexMax] + " - Puntuación: " + maxPuntos);
        System.out.println("Equipo último clasificado: " + arrayNombres[indexMin] + " - Puntuación: " + minPuntos);
        System.out.println("Puntuación media de los equipos: " + puntuacionMedia);
      
        teclado.close();
    }
}

