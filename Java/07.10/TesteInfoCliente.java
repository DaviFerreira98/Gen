package Familia36;

public class TesteInfoCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InfoCliente[]lista = new InfoCliente[3];
		lista[0]=new InfoCliente("Davi Ferreira","Rua Abc","Davizinho@gmail.com",123456789);
		lista[1]=new InfoCliente("Danilo Freitas","Rua Tio","DanFreitas@gmail.com",456789123);
		lista[2]=new InfoCliente("Emyli Flores","Rua Oscar Freire","DonaFlorinda@gmail.com",998125674);
		
		for(InfoCliente roda:lista) {
			roda.mostrar();
		}
		lista[1].setEndereco("Rua Andre Freitas de Noronha");
		System.out.println("\n************** Mudanca de endereço **************");
		lista[1].mostrar();
		

	}

}
