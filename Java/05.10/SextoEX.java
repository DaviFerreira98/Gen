package Familia36;

import java.util.Scanner;

public class SextoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int num,soma=0,x=0;
		float media;
		
		System.out.println("Digite os numeros");
		num=ler.nextInt();
		
		do {
			if(num%3==0) {
				soma+=num;
				x++;
			}
			System.out.println("Digite os numeros");
			num=ler.nextInt();
			
			
		}while(num!=0);
		media=soma/x;
		System.out.printf("A media dos numeros multiplos de 3 é: %.2f", media);
	}

}
