package Familia36;

import java.util.Scanner;

public class TerceiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("Digite a idade");
		idade=leia.nextInt();
		
		if(idade<=14 && idade>=10) {
			System.out.println("Pertence a Turma Infantil");
		}
		else if(idade>=15 && idade<=17) {
			System.out.println("Pertence a Turma Juvenil");
		}
		else if(idade>=18 && idade<=25) {
		System.out.println("Pertece a Turma Adulto");
		}
		else {
			System.out.println("\nnão temos turma para essa idade");
		}
		
		}

}
