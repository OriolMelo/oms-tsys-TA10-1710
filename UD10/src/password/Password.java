package password;

public class Password {

	public Password() {
		this.longitud = LONG;
		this.contraseña = "";
	}
	
	public Password(int longitud) {
		this.longitud = longitud;
		this.contraseña = generarPassword();
	}
	
	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	private String generarPassword() {
		String contra = "";
		for(int i=0; i<longitud; i++) {
			contra=contra.concat(String.valueOf(caracteres.charAt(generarAleatorio(0,caracteres.length()-1))));
		}
		return contra;
	}

	private int generarAleatorio(int min, int max) {
		return (int)Math.floor(Math.random() * (max - min + 1) + min);
	}

	public boolean esFuerte() {
		int mayus = 0;
		int minus = 0;
		int num = 0;
		boolean esFuerte = false;
		for(int i=0; i<contraseña.length(); i++) {
			if(contraseña.charAt(i) >= '0' && contraseña.charAt(i) <= '9') {
				num++;
			}
			else if(contraseña.charAt(i) >= 'A' && contraseña.charAt(i) <= 'Z') {
				mayus++;
			}
			else if(contraseña.charAt(i) >= 'a' && contraseña.charAt(i) <='z') {
				minus++;
			}
		}
		if(mayus > 2 && minus >1 && num > 5)
			esFuerte = true;
		
		return esFuerte;
	}
	
	
	
	private int longitud;
	private String contraseña;
	private String caracteres = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	
	private final int LONG = 8;
}
