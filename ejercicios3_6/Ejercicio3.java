package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int resta=0, suma=1, nSerie, contadorSerie=1,sw =1;
		do{
			System.out.println("Introduce el numero de caracteres de la serie: ");
			nSerie = Consola.leeInt();
		}while (nSerie < 1);
		while(contadorSerie<=nSerie) {
			switch (sw) {
			case 1:
				System.out.print(resta);
				resta-=2;
				sw*=-1;
				break;

			case -1:
				System.out.print("\t"+suma+"\t");
				suma+=2;
				sw*=-1;
				break;
			}
			contadorSerie++;
		}
	}

}
