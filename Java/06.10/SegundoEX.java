package Familia36;

import java.util.Scanner;

public class SegundoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = new int[6];
		int x;
		float somapar = 0,quantimpar=0;
		Scanner leia = new Scanner(System.in);
		
		for(x=0;x<6;x++) {
			System.out.println("Digite um numero:");
			A[x]=leia.nextInt();
			}
		System.out.println("os numeros pares");
			for(x=0;x<6;x++) {
			if(A[x]%2==0){ // par
					somapar+=A[x];
					System.out.print(" " +A[x]+" /");
				}
			}
			System.out.println("\nOs numeros impares");
			for(x=0;x<6;x++) {
				if(A[x]%2!=0) {
					quantimpar++;
					System.out.printf(" "+A[x]+ " /");
				}
			}
		System.out.println("\nA quantidade de numeros Impares digitados é: "+quantimpar);
		System.out.println("\nA soma dos numeros PARES é: "+somapar);
		
	}

}
