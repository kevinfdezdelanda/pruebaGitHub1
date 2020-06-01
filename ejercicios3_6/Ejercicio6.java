package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resta=1, multiplicacion=1, nSerie, contadorSerie=1,sw =1, contadorResta=1;
		do{
			System.out.println("Introduce el numero de caracteres de la serie: ");
			nSerie = Consola.leeInt();
		}while (nSerie < 1);
		while(contadorSerie<=nSerie) {
			switch (sw) {
			case 1:
				System.out.print(multiplicacion);
				multiplicacion*=5;
				sw*=-1;
				break;

			case -1:
				System.out.print("\t"+resta+"\t");
				resta-=contadorResta;
				contadorResta++;
				sw*=-1;
				break;
			}
			contadorSerie++;
		}
	}

}
