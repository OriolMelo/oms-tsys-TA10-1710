package custom;


public class Ejercicio2App {

	public static void main(String[] args) {
		try {
			System.out.println("Mensaje mostrado por pantalla");
			throw new ExcepcionCustomizada("Esto es un objeto Exception");
		}
		catch(ExcepcionCustomizada e) {
			System.out.println("Excepcion capturada con mensaje: "+e.getMessage());
		}
		System.out.println("Programa terminado");
	}

}
