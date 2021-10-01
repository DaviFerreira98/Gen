package Familia36;

import java.util.Scanner;

public class QuintoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float n1,n2,n3,media;
		
		System.out.println("Digite a primeira nota: ");
		n1=leia.nextFloat();
		System.out.println("Digite a primeira nota: ");
		n2=leia.nextFloat();
		System.out.println("Digite a primeira nota: ");
		n3=leia.nextFloat();
		
		media = (n1*2)+(n2*3)+(n3*5);
		media = media/(2+3+5);
		
		System.out.printf("A Media é: %.2f",media);
	}

}
