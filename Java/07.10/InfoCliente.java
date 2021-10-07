package Familia36;

public class InfoCliente {

	private String nome;
	private String endereco;
	private String email;
	private int telefone;
	
	public InfoCliente(String n,String e,String em,int t) {
		this.setNome(n);
		this.setEndereco(e);
		this.setEmail(em);
		this.setTelefone(t);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
	
	public void mostrar() {
		System.out.println("\n"+nome+" "+" Endereço: "+endereco+" Email: "+ " Telefone: "+telefone);
	}
	
}
