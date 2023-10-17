package parimpar;
import java.util.Random;

public class ParImpar {

	public ParImpar() {
		this.minimo = MINIMO_BASE;
		this.maximo = MAXIMO_BASE;
		this.numero = num_aleatorio();
		System.out.println("El numero aleatorio generado es "+numero);
	}
	
	public boolean esPar() {
		return this.numero%2==0;
	}
	
	private int num_aleatorio() {
		System.out.println("Generando número aleatorio...");
		Random ran = new Random();
		return ran.nextInt(maximo+1);
	}
	
	private int numero;
	
	private int minimo;
	private int maximo;
	private final int MINIMO_BASE = 0;
	private final int MAXIMO_BASE = 999;
}
