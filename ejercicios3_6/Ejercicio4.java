package ejercicios3_6;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sw =1, num=1, multiplicador=2;
		while (num<100) {
			switch (sw) {
			case 1:
				System.out.print(num);
				num*=multiplicador;
				multiplicador+=1;
				sw*=-1;
				break;

			case -1:
				System.out.print("\t"+num+"\t");
				num-=1;
				sw*=-1;
				break;
			}
		}
	}

}
