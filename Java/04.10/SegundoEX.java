package Familia36;

import java.util.Scanner;

public class SegundoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int n1,n2,n3;
		
		System.out.println("Digite o Primeiro Numero");
		n1=leia.nextInt();
		System.out.println("Digite o Segundo Numero");
		n2=leia.nextInt();
		System.out.println("Digite o Terceiro Numero");
		n3=leia.nextInt();
		
		if(n1>n2 && n1>n3) {
			if(n2>n3) {
				System.out.printf("\n%d",n3);
				System.out.printf("\n%d",n2);
				System.out.printf("\n%d",n1);
			}
			else {
				System.out.printf("\n%d",n2);
				System.out.printf("\n%d",n3);
				System.out.printf("\n%d",n1);
			}
				
		}
		else if(n2>n1 && n2>n3) {
			if(n1>n3) {
				System.out.printf("\n%d",n3);
				System.out.printf("\n%d",n1);
				System.out.printf("\n%d",n2);
			}
			else {
				System.out.printf("\n%d",n1);
				System.out.printf("\n%d",n3);
				System.out.printf("\n%d",n2);
			}
		}
		if(n3>n1 && n3>n2) {
			if(n1>n2) {
				System.out.printf("\n%d",n2);
				System.out.printf("\n%d",n1);
				System.out.printf("\n%d",n3);
			}
			else {
				System.out.printf("\n%d",n1);
				System.out.printf("\n%d",n2);
				System.out.printf("\n%d",n3);
			}

		}
	}
}