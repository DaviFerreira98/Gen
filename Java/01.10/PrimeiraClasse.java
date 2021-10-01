package Familia36;

import java.util.Scanner;

public class PrimeiraClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2,n3,media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite a Prieira nota: ");
		n1 = leia.nextFloat();
		System.out.println("\nDigite a segunda nota: ");
		n2 = leia.nextFloat();
		System.out.println("\nDigite a terceira nota: ");
		n3 = leia.nextFloat();
		
		media = (n1+n2+n3)/3;
		
		System.out.printf("A media é: %2.2f",media);
		
		n1 = Math.sqrt(n2);
		n2 = Math.pow(n3, 3);
		n3 = n1%n2;
		
		System.out.printf("\nAs Notas separadas São: %.2f",n1);
		System.out.printf("\nA Segunda nota: %.2f", n2);
		System.out.printf("\nA terceira nota %.2f",n3);
	}

}
