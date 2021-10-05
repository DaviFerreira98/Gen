package Familia36;

import java.util.Scanner;

public class QuintoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler =new Scanner(System.in);
		int x,soma=0;
		
		System.out.println("Digite um numero");
		x=ler.nextInt();
		do {
			soma+=x;
			
			System.out.println("Digite um numero");
			x=ler.nextInt();
			
		}while(x!=0);
		System.out.printf("A soma dos numeros é: %d",soma);
	}

}
