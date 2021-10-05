package Familia36;

import java.util.Scanner;

public class SegundoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler= new Scanner(System.in);
		int par=0,impar=0,i,x;
		
		for(i=0;i<10;i++) {
			System.out.println("Digite um numero");
			x=ler.nextInt();
			
			if(x%2==0) { //ler numeros pares
				par++;
			}
			else {
				impar++;
			}
			
		}
		System.out.printf("O total de numeros pares: %d\nO total de numeros impares: %d", par,impar);
		
	}

}
