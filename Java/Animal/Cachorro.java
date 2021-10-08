package Animal;

public class Cachorro extends Animal{
	
	private String tamanho;
	private String raca;

	public Cachorro(String nome, int idade, String som, String tamanho, String raca) {
		super(nome, idade, som);
		this.tamanho=tamanho;
		this.raca=raca;
		
	}
	
	public void Info() {
		System.out.println("O Nome do seu cachorro: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nPorte: "+tamanho
				+"\nRaça: "+raca
				+"\nO som dele: "+getSom());
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
