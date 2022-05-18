package paquete1;
import java.util.Scanner;

public class Programa {
Scanner teclado = new Scanner(System.in);
String apellido;
int edad;
double altura;
int cedula=0;

public void iniciar() {
	cargar();
	imprimir();
	}

private void cargar() {
System.out.println("Ingrese su apellido: ");
apellido = teclado.next();
System.out.println("Ingrese su altura: ");
altura = teclado.nextInt();
System.out.println("Ingrese su edad: ");
altura = teclado.nextDouble();
System.out.println("Ingrese su cédula: ");
cedula = teclado.nextInt();
}

private void imprimir() {
	System.out.println("Su apellido es: " + apellido);
	System.out.println("Su altura es: " + altura);
	System.out.println("Su edad es: " + edad);
	System.out.println("Su cédula es: " + cedula);
	
}
}

