package Familia36;

import java.util.Scanner;

public class TerceiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler=new Scanner(System.in);
		int idade,i=0,x=0,somaida =0;
		
		System.out.println("Escreva sua idade");
		idade=ler.nextInt();
		
		while(idade>=1) {
			somaida+=idade;
			if(idade<=21) {	//verificar se � menor de 21
				i++;
			}
			else if(idade>=50) { // verificar se � maior que 50
				x++;
			}
			System.out.println("Escreva sua idade");
			idade=ler.nextInt();
		}
		
		System.out.printf("As pessoas menos � 21 anos s�o: %d \nAs pessoas maiores a 50 anos s�o: %d \nE o total da soma das idades �: %d",i,x,somaida);
	}

}
