package Familia36;

import java.util.Scanner;

public class SegundoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias,anos,meses,total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite todos os seus dias: ");
		total = leia.nextInt();
		
		anos= total/365;
		meses = (total%365)/30;
		dias = (meses%12)%30;
		
		System.out.printf("\nSua idade � : %d", anos);
		System.out.printf("\nSeus Meses s�o : %d", meses);
		System.out.printf("\nSeus dias s�o : %d", dias);
		
	}

}
