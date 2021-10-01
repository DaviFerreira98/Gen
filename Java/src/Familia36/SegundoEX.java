package Familia36;

import java.util.Scanner;

public class SegundoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dias,anos,meses,total;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite todos os seus dias: ");
		dias = leia.nextInt();
		
		anos= dias/365;
		meses = anos/12;
		dias = (meses*30)/12;
		
		System.out.printf("\nSua idade é : %d", anos);
		System.out.printf("\nSeus Meses são : %d", meses);
		System.out.printf("\nSeus dias são : %d", dias);
		
	}

}
