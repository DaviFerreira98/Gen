package Familia36;

import java.util.Scanner;

public class PrimeiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3,maior = 0;
		System.out.println("Digite o primeiro Numero");
		n1=leia.nextInt();
		System.out.println("Digite o segundo Numero");
		n2=leia.nextInt();
		System.out.println("Digite o terceiro Numero");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			maior=n1;
		}
		else if(n2>n3 && n2>n1) {
			maior=n2;
		}
		else if(n3>n1 && n3>n2) {
			maior=n3;
		}
		System.out.printf("O numero maior digitado foi: %d", maior);
	}

}
