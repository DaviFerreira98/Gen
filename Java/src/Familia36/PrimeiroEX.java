package Familia36;

import java.util.Scanner;

public class PrimeiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int anos,meses,dias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nDigite quantos anos tem: ");
		anos = leia.nextInt();
		System.out.println("\nDigite quantos meses: ");
		meses = leia.nextInt();
		System.out.println("\nDigite quantos dias");
		dias = leia.nextInt();
		
		anos = anos*365;
		meses = meses*30;
		dias = anos+meses+dias;
		
		System.out.printf("O total de dias são: %d", dias);
	}

}
