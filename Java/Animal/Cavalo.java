package Animal;

public class Cavalo extends Animal{
		
	private String pelagem;
	private String tipo;
	
	public Cavalo(String nome, int idade, String som, String pelagem, String tipo) {
		super(nome, idade, som);
		this.pelagem=pelagem;
		this.tipo=tipo;
		
	}
	public void Info() {
		System.out.println("\nO Nome do seu Cavalo: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nA cor da pelagem: "+pelagem
				+"\nTipo: "+tipo
				+"\nO som dele: "+getSom());
	}
	public String getPelagem() {
		return pelagem;
	}
	public void setPelagem(String pelagem) {
		this.pelagem = pelagem;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
