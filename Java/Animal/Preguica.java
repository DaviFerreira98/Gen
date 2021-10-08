package Animal;

public class Preguica extends Animal {
	
	private String especie;

	public Preguica(String nome, int idade, String som, String especie) {
		super(nome, idade, som);
		this.especie=especie;

	}
	public void Info() {
		System.out.println("\nO Nome da sua Preguiça: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nEspecie: "+especie
				+"\nO som dele: "+getSom());
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}

}
