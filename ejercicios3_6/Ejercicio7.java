package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, contador=0,inicioSerie;
		do{
			System.out.println("Introduce el primer caracter de la serie: ");
			inicioSerie = Consola.leeInt();
		}while (inicioSerie < 1);
		num=inicioSerie;
		while (num>0) {
			num-=contador;
			contador++;
			if (num>=0) {
				System.out.print(num+"\t");
			}
		}
		while (num<inicioSerie) {
			contador--;
			num+=contador;
			System.out.print(num+"\t");
		}
	}

}
