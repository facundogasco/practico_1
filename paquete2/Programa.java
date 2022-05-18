package paquete2;
import java.util.Random;
import java.util.Scanner;
public class Programa {
	Random azar= new Random();
	Scanner teclado = new Scanner(System.in);
	int num1;
	int num2;
	int i;
	public void iniciar() {
		generar();
		comparar();
	}

	private void generar() {
		num1= azar.nextInt(100)+1;
	}

	private void comparar() {
		
		do{
			System.out.println("Ingrese un número: ");
			num2 = teclado.nextInt();
			if (num1==num2){
				System.out.println("ganaste");
			}
			else if(num2>num1){
				System.out.println("Tu numero es demasiado grande, ingresa otro");
			}
			else if(num2<num1) {
				System.out.println("tu numero es demasiado pequeño, ingresa otro");
			}
		}while(num2!=num1);
		}
		
	}

