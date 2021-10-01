package Familia36;

import java.util.Scanner;

public class TerceiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int seg,min,hora,total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nEscreva os Segundos: ");
		total=leia.nextInt();
		hora=total/3600;
		min=(total% 3600)/60;
		seg=(total%3600)%60;
		
		System.out.printf("\nHoras: %d",hora);
		System.out.printf("\nMinutos: %d",min);
		System.out.printf("\nSegundos: %d",seg);
		
	}

}
