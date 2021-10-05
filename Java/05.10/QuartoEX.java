package Familia36;

import java.util.Scanner;

public class QuartoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner info= new Scanner(System.in);
		int idade=0,genero=0,psico=0,calmas=0,Mnervo=0,Hagre=0,Ocalmos=0,nervo=0,menorcalmo=0,pessoas=0;
		
		System.out.println("Por favor digite sua idade.");
		idade=info.nextInt();
		System.out.println("Por favor escolha seu genero:"
				+ "\n1-Feminino"
				+ "\n2-Masculino"
				+ "\n3-Outros");
		genero=info.nextInt();
		System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
				+ "\n1-Voce é uma pessoa calma"
				+ "\n2-Voce é uma pessoa nervosa"
				+ "\n3-Voce é uma pessoa agressiva");
		psico=info.nextInt();
		
		while(idade>=1 && genero>=1 && genero<=3 && psico>=1 && psico<=3 && pessoas!=150) { //Começa minha repetição
			
			if (psico==1) {	//numero de pessoas calmas
				calmas++;
			}
			if(genero==1 && psico==2) { //numeors de mulheres nervosas
				Mnervo++;
			}
			if(genero==2 && psico==3) { //Numero de Homens Agressivos
				Hagre++;
			}
			if(genero==3 && psico==1) { //Numeros de outros Calmos
				Ocalmos++;
			}
			if(idade>=40 && psico==2) {
				nervo++;//Pessoas nervosas com mais de 40 anos
			}
			if(idade<=18 && psico==1) {
				menorcalmo++; //Pessoas calmas menor de 18 anos
			}
			System.out.println("Por favor digite sua idade.");
			idade=info.nextInt();
			System.out.println("Por favor escolha seu genero:"
					+ "\n1-Feminino"
					+ "\n2-Masculino"
					+ "\n3-Outros");
			genero=info.nextInt();
			System.out.println("Selecione a caracteristica que mais se assemelhar a voce:"
					+ "\n1-Voce é uma pessoa calma"
					+ "\n2-Voce é uma pessoa nervosa"
					+ "\n3-Voce é uma pessoa agressiva");
			psico=info.nextInt();
			pessoas++;
		}
		
		System.out.printf("\nO numero de pessoas calmas: %d", calmas);
		System.out.printf("\nO numero de Mulheres Nervosas: %d", Mnervo);
		System.out.printf("\nO numero de Homens Agressigos: %d", Hagre);
		System.out.printf("\nO numero de pessoas de genero Outros calmas: %d", Ocalmos);
		System.out.printf("\nO numero de pessoas Nervosas com mais de 40 anos: %d", nervo);
		System.out.printf("\nO numero de pessoas Calmas com menos de 18 anos: %d", menorcalmo);
		
	}

}
