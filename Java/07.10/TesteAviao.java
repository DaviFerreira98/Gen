package SegundoEX;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		String p,d,dtP,dtC,hrP,hrC,qt;
		Aviao voo = new Aviao(120,"","","","","","");
		
			System.out.println("Operario Insira o intinerario do VOO");
			System.out.println("*************************************************************************");
		
		try {
				
				System.out.println("Informe o numeros de passageiros do VOO: ");
				qt=leia.nextLine();
				voo.setNumPassagens(0);
				
				System.out.println("\nInforme a origem do voo:");
				p=leia.next();
				voo.setOrigem(p);
				
				System.out.println("\nInforme o Destino do voo:");
				d=leia.nextLine();
				voo.setDestino(d);
				
				System.out.println("\nInforme da data de Partida do Voo:");
				dtP=leia.nextLine();
				voo.formatarData();
				voo.setDataPartida(dtP);
				
				System.out.println("\nInforme a data de Chegada do Voo:");
				dtC=leia.nextLine();
				voo.setDataChegada(dtC);
				voo.formatarData();
				
				
				System.out.println("\nInforme a hora do embarque:");
				hrP=leia.nextLine();
				voo.setHoraPartida(hrP);
				voo.formatarHora();
				
				System.out.println("\nInforme a Hora de Chegada: ");
				hrC=leia.nextLine();
				voo.setHoraChegada(hrC);
				voo.formatarHora();
				

			
		}catch(Exception ex){
		ex.printStackTrace();
		}
		System.out.println("\n************ INTINERARIO DO VOO ************");
		voo.intinerario();
		System.out.println("***********************************************");
			
	}

}
