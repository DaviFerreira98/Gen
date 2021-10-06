package Familia36;

public class PrimeiroEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[] = {1, 0, 5, -2, -5, 7};
		int soma,x;
		
		soma = A[0]+A[1]+A[5];
		System.out.println("\nA soma dde alguns valores do vetor é: "+soma);
		A[4]=100;
		for(x=0;x<6;x++) {
		System.out.print(" "+A[x]+" /");
		}
		
	}

}
