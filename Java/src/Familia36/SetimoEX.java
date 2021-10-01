package Familia36;
	import java.util.Scanner;
public class SetimoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float a,b,c,d,e,f,x,y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o numero: ");
		a=leia.nextFloat();
		System.out.println("Digite o numero: ");
		b=leia.nextFloat();
		System.out.println("Digite o numero: ");
		c=leia.nextFloat();
		System.out.println("Digite o numero: ");
		d=leia.nextFloat();
		System.out.println("Digite o numero: ");
		e=leia.nextFloat();
		System.out.println("Digite o numero: ");
		f=leia.nextFloat();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.printf("Resultade de X: %.2f",x);
		System.out.printf("Resultado de y: %.2f",y);
	}

}
