package Animal;

public class Cavalo extends Animal{
		
	private String pelagem;
	private String tipo;
	
	public Cavalo(String nome, int idade, String pelagem, String tipo) {
		super(nome, idade );
		this.pelagem=pelagem;
		this.tipo=tipo;
		
	}
	@Override
	public void som(String barulho) {
		System.out.println("Pocoto...Pocoto");
	}
	@Override
	public void Habilidade(String hab) {
		System.out.println("Corre muitooooooooooo");
	}
	
	public void Info() {
		System.out.println("\nO Nome do seu Cavalo: "+getNome()
				+"\nIdade: "+getIdade()
				+"\nA cor da pelagem: "+pelagem
				+"\nTipo: "+tipo);
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
