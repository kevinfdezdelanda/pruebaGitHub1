package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nSerie, num, multiplicador=1;
		do{
			System.out.println("Introduce el numero de caracteres de la serie: ");
			nSerie = Consola.leeInt();
		}while (nSerie < 1);
		int contadorSerie = 1;
		num = 10;
		if (nSerie == 1) {
			System.out.println(num);
		}else {
			System.out.print(num+"\t");
			while (contadorSerie <= nSerie) {
				num*=(multiplicador);
				multiplicador*=2;
				System.out.print(num+"\t");
				contadorSerie++;
			}
		}
	}

}

