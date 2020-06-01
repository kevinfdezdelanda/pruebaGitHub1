package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nGrupos, contador=1, contadorGrupos=1;
		do{
			System.out.println("Introduce el numero de grupos: ");
			nGrupos = Consola.leeInt();
		}while (nGrupos < 1);
		while (contadorGrupos<=nGrupos) {
			System.out.print("#");
			contador=1;
			while (contador<=contadorGrupos) {
				System.out.print("-");
				contador++;
			}
			contadorGrupos++;
		}
	}

}
