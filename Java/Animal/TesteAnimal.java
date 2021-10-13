package Animal;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Cachorro ch1=new Cachorro("Rodinho", 10,"Medio","Chow Chow");
		Cavalo cv1=new Cavalo("Pé de Pano",5,"Creme","Tração");
		Preguica pg1=new Preguica("Miguelzinho", 10,"Preguiça-Real");
		Animal animal=null;
		
		int n=(int) (Math.random()*3.0);
		System.out.println("\nNumero escolhido: "+n);
		
		switch(n) {
		case 0: animal = ch1;break;
		case 1: animal = cv1;break;
		case 2: animal = pg1;break;
		default:
			System.out.println("Erro inesperado");
		}
		if(n==0) {
			ch1.Info();
			ch1.som(null);
			ch1.Habilidade(null);
			
		}
		else if(n==1) {
			cv1.Info();
			cv1.som(null);
			cv1.Habilidade(null);
		}
		else if(n==2) {
			pg1.Info();
			pg1.som(null);
			pg1.Habilidade(null);
		}
	}

}
