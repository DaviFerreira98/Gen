package Animal;

public class Cachorro extends Animal{
	
	private String tamanho;
	private String raca;

	public Cachorro(String nome, int idade, String tamanho, String raca) {
		super("Rodinho", 10);
		this.tamanho=tamanho;
		this.raca=raca;
		
	}
	
	public void som(String barulho) {
		System.out.println("AUAU...AUAU");
		
	}
	public void Habilidade(String hab) {
		System.out.println("Consegue Correr");
	}
	
	public void Info() {
		System.out.println("O Nome do seu cachorro: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nPorte: "+tamanho
				+"\nRaça: "+raca);
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
}
