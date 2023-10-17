package password;

import javax.swing.JOptionPane;

public class PasswordApp {

	public static void main(String[] args) {			
		
		try {
			String npasswords = JOptionPane.showInputDialog("Entra el numero de contraseñas a crear");
			Password[] pass = new Password [Integer.parseInt(npasswords)];
			String longitud = JOptionPane.showInputDialog("Entra la longitud de las contraseñas a crear");

			boolean compruebaPasswords[] = new boolean[Integer.parseInt(npasswords)];
			for (int i=0; i<pass.length; i++) {
				pass[i] = new Password(Integer.parseInt(longitud));
				compruebaPasswords[i] =pass[i].esFuerte();
				System.out.println(pass[i].getContraseña()+" "+compruebaPasswords[i]);
			}
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un entero");
		}

	}

}
