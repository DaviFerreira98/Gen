package Animal;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro ch1=new Cachorro("Migue",5,"AUAU","Medio","Chow Chow");
		Cavalo cv1=new Cavalo("P� de Pano",3,"POCOTO","Creme","Tra��o");
		Preguica pg1=new Preguica("Jorgin",8,"Barulho de Pregui�a","Pregui�a-Real");
		ch1.Info();
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("**********************************************************");
		cv1.Info();
		System.out.println();
		System.out.println("**********************************************************");
		System.out.println("**********************************************************");
		pg1.Info();
		
	}

}
