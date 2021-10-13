package Animal;

public class Preguica extends Animal {
	
	private String especie;

	public Preguica(String nome, int idade, String especie) {
		super("Miguelzinho", 10);
		this.especie=especie;

	}
	public void Info() {
		System.out.println("\nO Nome da sua Preguiça: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nEspecie: "+especie);
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	@Override
	public void som(String barulho) {
		System.out.println("Haaaaaaaaaaaaaaaa");
		
	}
	@Override
	public void Habilidade(String hab) {
		System.out.println("Subindo em Arvores");
		
	}

}
