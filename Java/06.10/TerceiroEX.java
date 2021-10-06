package Familia36;

import java.util.Scanner;

public class TerceiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matriz[][]= new int[3][3];
		int l,c,cont =0;
		Scanner ler = new Scanner(System.in);
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.println("Insira um valor de "+(l+1)+" "+(c+1)+":");
				matriz[l][c]=ler.nextInt();
				if(matriz[l][c]>10) {
					cont++;
				}
				
			}
		}
		System.out.println("Quantidade maior que 10 é: "+cont);
	}

}
