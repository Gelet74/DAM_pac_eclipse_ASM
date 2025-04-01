package Prueba;

import java.util.*;

public class Ejercicio1 {

	public static boolean auditoriaEmpresa(double salarioJefe, double salarioEncargado, 
			double salarioOficinistas, int numeroOficinistas,boolean proyectosTerminados, 
			double presupuestoEmpresa) {


		if (!proyectosTerminados) {
			System.out.println("No ha pasado la auditoría ya que no ha terminado los proyectos acordados");
			return false; 
		}


		double gastoSueldos = salarioJefe + salarioEncargado+salarioOficinistas;
		if (gastoSueldos > 20000) {
			System.out.println("No ha pasado la auditoría ya que el gasto en personal es de " + gastoSueldos + " y excede el límite mensual de 100.000 euros");
			return false; 
		}


		if (presupuestoEmpresa > 100000) {
			System.out.println("No ha pasado la auditoría ya que el presupuesto asignado de " + presupuestoEmpresa + " excede el límite establecido en 100.000 euros");
			return false; 
		}


		System.out.println("Enhorabuena!! Ha pasado la auditoría, nos vemos el año que viene");
		return true; 
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double salarioJefe = 0;
		double salarioEncargado = 0;
		boolean proyectosTerminados = true;
		double presupuestoEmpresa = 0;
		boolean resultado = true;

		System.out.print("Ingrese el salario del jefe: ");
		salarioJefe = teclado.nextDouble();

		System.out.print("Ingrese el salario del encargado: ");
		salarioEncargado = teclado.nextDouble();

		System.out.print("Ingrese el salario del oficinista: ");
		double salarioOficinistas = teclado.nextDouble();

		System.out.print("¿Los proyectos han sido terminados? (true/false): ");
		proyectosTerminados = teclado.nextBoolean();

		System.out.print("¿Cuántos oficinistas hay? ");
		int numeroOficinistas = teclado.nextInt();

		System.out.print("Ingrese el presupuesto de la empresa: ");
		presupuestoEmpresa = teclado.nextDouble();

		resultado = auditoriaEmpresa(salarioJefe, salarioEncargado, 
				salarioOficinistas, numeroOficinistas, proyectosTerminados, 
				presupuestoEmpresa);

		if (resultado) {
			System.out.println("Resultado de la auditoría: Apto");
		} else {
			System.out.println("Resultado de la auditoría: No apto");
		}

		teclado.close();
	}

}