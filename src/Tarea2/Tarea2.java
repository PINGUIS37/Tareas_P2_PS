package Tarea2;

import java.util.Scanner;

public class Tarea2 {

	
	public static void main(String[] args) {
		static char retorno = '}';
		static String lexema = "";
		Scanner cad = new Scanner(System.in);


		int estado = identificacion();

		switch (estado) {	

			case 0:
				System.out.println("Token: Error");
				break;


			
			default:
				break;
		}
		
		public static int identificacion(){
			char car = leer_car();
				if (car == 'o') {
					return estado1(car);
				}	
			
				if (car == 'a') {
					lexema += car;
					return estado5();
				}

				if (car == 'x') {
					lexema += car;
					return estado1();
				}

				if (car == 'y') {
					lexema += car;
					return estado2();
				}
				
				if (car == 'z') {
					lexema += car;
					return estado2();
				}
			
				lexema += car;
				return 0;

		}
		
		private static char leer_car() {
			Scanner cad = new Scanner(System.in);

			System.out.println("Introduce un caracter: ");
			return cad.nextLine().toLowerCase().charAt(0);
		}
		
		private void estado1(char car) {
			if (condition) {
				
			}

		}
}
