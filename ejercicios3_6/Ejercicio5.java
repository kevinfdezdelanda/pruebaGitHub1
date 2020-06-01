package ejercicios3_6;

import ejercicios3_1.Consola;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, multiplicador;
		do{
			System.out.println("Introduce el numero de inicio: ");
			num=Consola.leeInt();
		}while (num<1);
		multiplicador=num;
		while (multiplicador>0) {
			System.out.print(num+"\t");
			num*=multiplicador;
			multiplicador-=1;
		}
	}

}
