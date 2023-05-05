package Tarea1;

import java.util.Scanner;

public class Tarea1 {
	static char alfabeto[] = {'a', 'b','c', 'd', 'e','f', 'g', 'h','i', 'j', 'k','l', 'm', 'n','ñ', 'o', 'p','q', 'r', 's','t', 'u', 'v','w', 'x', 'y','z'};
	static int digito[] = {0, 1, 2, 3, 4,5 ,6 , 7, 8, 9};
	static final int  SUMA = 1;
	static final int  PRODUCTO = 2;
	static final int  IDENTIFICADOR = 4;
	static final int  NUMERO = 6;

	public static void main(String[] args) {
		Scanner cad = new Scanner(System.in);
		char car;

		System.out.println("Introduce un caracter: ");
		car = cad.nextLine().toLowerCase().charAt(0);

		int estado = identificacion(car);

		switch (estado) {	
			case SUMA:
				System.out.println("Token: +");
				break;

			case '*':
				System.out.println("Token: *");
				break;

			case '0':
				System.out.println("Token: Error");

			case IDENTIFICADOR:
				System.out.println("Token: Identificador");

			case NUMERO:
				System.out.println("Token: Número");

			case 
			
			default:
				break;
		}
	}

	public static int identificacion(char car){
		
		for (char var1 : alfabeto) {
			if (car == var1) {
				return estado3();
			}	
		}

		for (int var2 : digito) {
			if (car == var2) {
				return 2;
			}
		}

		if (car == '+') {
			return estado1();
		}

		if (car == '*') {
			return estado2();
		}



	}
	
	private static int estado1() {
		return SUMA;
	}

	private static int estado2() {
		return PRODUCTO;
	}

	private static int estado3() {
		
	}

	private static int estado4() {
		return IDENTIFICADOR;
	}

	private static void estado5() {
		
	}

	private static int estado6() {
		return NUMERO;
	}
}