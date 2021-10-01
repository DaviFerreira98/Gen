package Familia36;
	import java.util.Scanner;
public class OitavoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia=new Scanner(System.in);
		double cons,fab,dis,imp;
		
		System.out.println("Valor do carro no fabrica: ");
		fab =leia.nextFloat();
		dis = fab*0.28;
		imp= fab*0.45;
		cons = fab+(dis + imp);
		System.out.printf("\nO Valor do carro para o consumidor é: %.2f",cons);
	}

}
