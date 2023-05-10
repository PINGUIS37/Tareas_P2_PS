package Tarea1;

import java.util.Scanner;

public class Tarea1 {
	static char alfabeto[] = {'a', 'b','c', 'd', 'e','f', 'g', 'h','i', 'j', 'k','l', 'm', 'n','ñ', 'o', 'p','q', 'r', 's','t', 'u', 'v','w', 'x', 'y','z'};
	static char digito[] = {'0', '1', '2', '3', '4','5' ,'6' , '7', '8', '9'};
	static final int  SUMA = 1;
	static final int  PRODUCTO = 2;
	static final int  IDENTIFICADOR = 4;
	static final int  NUMERO = 6;
	static char retorno = '}';
	static String lexema = "";

	public static void main(String[] args) {
		Scanner cad = new Scanner(System.in);


		int estado = identificacion();

		switch (estado) {	
			case SUMA:
				System.out.println("Token: +");
				break;

			case 0:
				System.out.println("Token: Error");
				break;

			case IDENTIFICADOR:
				System.out.println("Token: Identificador");
				break;

			case NUMERO:
				System.out.println("Token: Número");
				break;
				
			case PRODUCTO:
				System.out.println("Token: *");
				break;

			
			default:
				break;
		}
		
		if (retorno != '}') {
			System.out.println("Retorno: " + retorno);
		}
		System.out.println("Lexema: " + lexema);
	}

	public static int identificacion(){
		char car = leer_car();
		for (char var1 : alfabeto) {
			if (car == var1) {
				lexema += car;
				return estado3();
			}	
		}

		for (int var2 : digito) {
			if (car == var2) {
				lexema += car;
				return estado5();
			}
		}

		if (car == '+') {
			lexema += car;
			return estado1();
		}

		if (car == '*') {
			lexema += car;
			return estado2();
		}
		
		lexema += car;
		return 0;

	}
	
	private static int estado1() {
		return SUMA;
	}

	private static int estado2() {
		return PRODUCTO;
	}
	
	

	private static int estado3() {
		char car = leer_car();
		for (char var1 : alfabeto) {
			if (car == var1) {
				lexema += car;
				return estado3();
			}	
		}

		for (int var2 : digito) {
			if (car == var2) {
				lexema += car;
				return 2;
			}
		}
		
		
		return estado4(car);
	}
	
	private static int estado4(char car) {
		retorno = car;
		return IDENTIFICADOR;
	}

	private static int estado5() {
		char car = leer_car();
		for (int var2 : digito) {
			if (car == var2) {
				lexema += car;
				return estado5();
			}
		}
		
		return estado6(car);
	}

	private static int estado6(char car) {
		retorno = car;
		return NUMERO;
	}
	
	private static char leer_car() {
		Scanner cad = new Scanner(System.in);

		System.out.println("Introduce un caracter: ");
		return cad.nextLine().toLowerCase().charAt(0);
	}
}