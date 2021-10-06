package Familia36;

import java.util.Scanner;

public class QuartoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1[][]=new int [2][2];
		int n2[][]=new int [2][2];
		int soma[][]= new int[2][2];
		int sub[][]= new int[2][2];
		int constante[][]= {{1,2},{2,3}};
		Scanner ler=new Scanner(System.in);
		int l,c,menu;
		
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				System.out.println("Digite o valor de " +(l+1)+" "+(c+1)+":");
				n1[l][c]=ler.nextInt();
			}
		}
		for(l=0;l<2;l++) {
			for(c=0;c<2;c++) {
				System.out.println("Digite o valor de " +(l+1)+" "+(c+1)+":");
				n2[l][c]=ler.nextInt();
			}
		}
		
		System.out.println("Escolha uma das opções abaixo"
				+ "\n1-Somar as duas matrizes"
				+ "\n2-Subtrair as matrizes"
				+ "\n3-Adicionar uma constante as duas matrizes"
				+ "\n4-Imprimir as matrizes");
		menu=ler.nextInt();
		while(menu<1 || menu>4) {
			System.out.println("Opção invalidade digite uma opção valida");
			System.out.println("Escolha uma das opções abaixo"
					+ "\n1-Somar as duas matrizes"
					+ "\n2-Subtrair as matrizes"
					+ "\n3-Adicionar uma constante as duas matrizes"
					+ "\n4-Imprimir as matrizes");
			menu=ler.nextInt();
		}
		
		if(menu==1) {
			for(l=0;l<2;l++) {
				for(c=0;c<2;c++) {
					soma[l][c]=n1[l][c]+n2[l][c];
					System.out.print(" "+soma[l][c]+" /");
				}	
			}
		}
		else if(menu==2) {
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						sub[l][c]=n1[l][c]+n2[l][c];
						System.out.print(" "+sub[l][c]+" /");
						}
					}
			}
			else if(menu==3) {
				System.out.println("Matriz A");
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						n1[l][c]=n1[l][c]+constante[l][c];
						System.out.print(" "+n1[l][c]+" /");

					}
				}System.out.println("\nMatriz B");
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						n1[l][c]=n1[l][c]+constante[l][c];
						System.out.print(" "+n2[l][c]+" /");
					}
				}
				
			}
			else if(menu==4){
				for(l=0;l<2;l++) {
					for(c=0;c<2;c++) {
						System.out.print(" "+n1[l][c]+" /");
						System.out.println("\n");
						System.out.print(" "+n2[l][c]+" /");
					}
				}
				
			}
	}
}
