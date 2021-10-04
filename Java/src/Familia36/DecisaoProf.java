package Familia36;

import java.util.Scanner;

public class DecisaoProf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		float n1,n2,n3,media;
		
		System.out.println("Digite a Primeira nota");
		n1=leia.nextFloat();
		System.out.println("Digite a Segunda nota");
		n2=leia.nextFloat();
		System.out.println("Digite a Terceira nota");
		n3=leia.nextFloat();
		
		media=(n1+n2+n3)/3;
		
		System.out.printf("A media do Aluno é: %.2f ", media);
		
		if(media>=7 && media<=10){
			System.out.printf("APROVADO!!");
		}
		else if(media>=5 && media<=6) {
			System.out.println("Esta de RECUPERAÇÂO");
		}
		else if(media>=0 && media<=4) {
			System.out.println("REPROVADO!!!");
		}
		else {
			System.out.println("Erro na Media");
		}
	}

}
