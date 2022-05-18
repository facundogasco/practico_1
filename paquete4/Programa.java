package paquete4;
import java.util.Scanner;
public class Programa {
	Scanner teclado = new Scanner(System.in);
	void iniciar(){
		double num1,num2,num3;
		num1=cargar();
		num2=cargar();
		num3=cargar();
		menu(num1, num2, num3);
		
	}
	
	private double cargar() {
		
		System.out.println("Ingrese un número:");
		double num=teclado.nextDouble();
		return num;
	}
	
	
	
	 void menu(double a, double b, double c) {
		int opcion;
		do {
			System.out.println("Elija una opción:");
			System.out.println("1.El cuadrado y la raíz cuadrada de cada valor.");
			System.out.println("2.Bhaskara"); 
			System.out.println("3.El mayor de los tres números"); 
			System.out.println("4.Salir ");
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("El cuadrado de " + (a) + (" es ")+ (Math.pow(a, 2)+(" y su raiz cuadrada es ")+(Math.sqrt(a))));
				System.out.println("El cuadrado de " + (b) + (" es ")+ (Math.pow(b, 2)+(" y su raiz cuadrada es ")+(Math.sqrt(b))));
				System.out.println("El cuadrado de " + (c) + (" es ")+ (Math.pow(c, 2)+(" y su raiz cuadrada es ")+(Math.sqrt(c))));
				break;
			case 2:
				//System.out.println((Math.pow(a, 2))+ (b)+(c));
				double bhaskara=Math.pow(b, 2);
				 double bhaskara2= (bhaskara -4*a*c);
				 double numfinal = Math.sqrt(bhaskara2);
				 System.out.println(numfinal);
				break;
			case 3:
				double mayor1= Math.max(a, b);
				double mayor2= Math.max(mayor1, c);
				System.out.println("El mayor numero es " + mayor2);
		}
	}while (opcion!=4);
	 
	
	 }
}
