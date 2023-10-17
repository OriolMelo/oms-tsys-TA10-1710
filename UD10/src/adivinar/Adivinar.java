package adivinar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Adivinar {
	
	public Adivinar() {
		max = MAXIMO;
		min = MINIMO;
		num = generarAleatorio();
	}
	
	private int generarAleatorio() {
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}
	
	public void leerNumero() {
		try {
			sc = new Scanner(System.in);
			do {
				System.out.println("Introduce el número deseado");
				valor_usuario = sc.nextInt();
			}
			while(valor_usuario <1 || valor_usuario > 500);
			
			intentarAdivinar();
			
		}catch (InputMismatchException e ){
			System.out.println("Tienes que introducir un valor numérico entero entre 1 y 500");
			intentos++;
			
			leerNumero();
		}
	}
	
	public void intentarAdivinar() {
		intentos++;
		if(valor_usuario > num) {
			System.out.println("El número es más pequeño");
			leerNumero();
		}
		else if (valor_usuario < num) {
			System.out.println("El número es más grande");
			leerNumero();
		}
		else {
			System.out.println("El número es correcto");
			System.out.println("Has hecho "+intentos+ " intentos");
			sc.close();

		}
		
	}
	

	private final int MAXIMO = 500;
	private final int MINIMO = 1;
	
	private int max;
	private int min;
	private int num; 
	private int valor_usuario;
	private int intentos;
	private Scanner sc;
}
