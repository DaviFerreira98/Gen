package Familia36;
import java.util.Scanner;
public class SextoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double a,b,c,d,r,s;
		System.out.println("Numero a: ");
		a = leia.nextFloat();
		System.out.println("Numero b: ");
		b = leia.nextFloat();
		System.out.println("Numero c: ");
		c = leia.nextFloat();
		
		r=Math.pow((a+b), 2);
		s=Math.pow((b+c), 2);
		d=(r+s)/2;
		System.out.printf("O Resultado de D: %.2f", d);
		System.out.printf("\nO Resultado de R: %.2f", r);
		System.out.printf("\nO Resultado de S: %.2f", s);
	}

}
