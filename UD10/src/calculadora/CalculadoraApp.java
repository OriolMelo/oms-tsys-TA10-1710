package calculadora;

import javax.swing.JOptionPane;

public class CalculadoraApp {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		String continuar;
		do { 
			continuar = operacion(calculadora);
		}while(!continuar.equals("EXIT"));
	
	}
	
	public static String operacion(Calculadora calculadora) {
		String operando = JOptionPane.showInputDialog("Introduce la operacion (SUMA, RESTA, MULTIPLICACION, "
				+ "DIVISION, RAIZ CUADRADA, RAIZ CUBICA, POTENCIA (EXIT para salir)");
		switch(operando){
			case "SUMA":
				calculadora.sumar();
				break;
			case "RESTA":
				calculadora.restar();
				break;
			case "MULTIPLICACION":
				calculadora.multiplicar();
				break;
			case "DIVISION":
				calculadora.dividir();
				break;
			case "RAIZ CUADRADA":
				calculadora.raizCuadrada();
				break;
			case "RAIZ CUBICA":
				calculadora.raizCubica();
				break;
			case "POTENCIA":
				calculadora.potencia();
				break;
			case "EXIT":
				break;
			default:
				System.out.println("Introduce la operacion (SUMA, RESTA, MULTIPLICACION, "
						+ "DIVISION, RAIZ CUADRADA, RAIZ CUBICA, POTENCIA (EXIT para salir)");
		}
		return operando;
	}

}
