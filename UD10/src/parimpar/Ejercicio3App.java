package parimpar;
import custom.ExcepcionCustomizada;

public class Ejercicio3App {

	public static void main(String[] args) {
		try {
			ParImpar num = new ParImpar();
			if(num.esPar()) {
				throw new ExcepcionCustomizada("Es par");
			}
			else {
				throw new ExcepcionCustomizada("Es impar");
			}
		}
		catch(ExcepcionCustomizada e) {
			System.out.println(e.getMessage());
		}
	}

}
