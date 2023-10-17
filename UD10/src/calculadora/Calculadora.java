package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {
	
	public Calculadora() {
		this.operando1 = 0;
		this.operando2 = 0;
		this.resultado = 0;
	}
	
	public void sumar() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el primer operando");
			this.operando1 = Double.parseDouble(operando);
			String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
			this.operando2 = Double.parseDouble(operando2);
			resultado = this.operando1+this.operando2;
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}

	public void restar() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el primer operando");
			this.operando1 = Double.parseDouble(operando);
			String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
			this.operando2 = Double.parseDouble(operando2);
			resultado = this.operando1-this.operando2;
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	public void multiplicar() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el primer operando");
			this.operando1 = Double.parseDouble(operando);
			String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
			this.operando2 = Double.parseDouble(operando2);
			resultado = this.operando1*this.operando2;
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	public void dividir() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el primer operando");
			this.operando1 = Double.parseDouble(operando);
			String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando");
			this.operando2 = Double.parseDouble(operando2);
			resultado = this.operando1/this.operando2;
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	public void raizCuadrada() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el operando deseado");
			this.operando1 = Double.parseDouble(operando);
			resultado = Math.sqrt(this.operando1);
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	public void raizCubica() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el operando deseado");
			this.operando1 = Double.parseDouble(operando);
			resultado = Math.cbrt(this.operando1);
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	public void potencia() {
		try {
			String operando = JOptionPane.showInputDialog("Introduce el primer operando base");
			this.operando1 = Double.parseDouble(operando);
			String operando2 = JOptionPane.showInputDialog("Introduce el segundo operando exponente");
			this.operando2 = Double.parseDouble(operando2);
			resultado = Math.pow(this.operando1, this.operando2);
			System.out.println(resultado);
		}
		catch(Exception e) {
			System.out.println("ERROR "+e.getMessage()+": tienes que introducir un número");
		}
	}
	
	private double operando1;
	private double operando2;
	private double resultado;
}
