package Familia36;

import java.util.Scanner;

public class QuartoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double num,raiz,quad;
		
		System.out.println("Digite um numero");
		num=leia.nextFloat();
		
		if(num%2==0) {
			raiz=Math.sqrt(num);
			System.out.printf("O numero � par %.2f e a raiz dele �: %.2f",num,raiz);
		}
		else {
			quad=Math.pow(num, 2);
			System.out.printf("O numeto � impar %.2f e ele aou quadoro �: %.2f",num, quad);
		}

	}

}
