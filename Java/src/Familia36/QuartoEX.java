package Familia36;
	import java.util.Scanner;
public class QuartoEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		double d,x1,x2,y1,y2;
		System.out.println("Digite x1");
		x1= leia.nextDouble();
		System.out.println("Digite x2");
		x2= leia.nextDouble();
		System.out.println("Digite y1");
		y1= leia.nextDouble();
		System.out.println("Digite y2");
		y2= leia.nextDouble();
		
		d= Math.sqrt((Math.pow((x2-x1),2))+(Math.pow((y2-y1),2)));
		System.out.printf("O resutado: %.2f",d);
	}

}
