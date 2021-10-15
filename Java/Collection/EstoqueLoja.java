package Colection;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueLoja {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int op;
		ArrayList<String> produtos = new ArrayList();
		do
		{
		System.out.println("Controle do Estoque da Loja");
		System.out.println("***********************************************************************");
		System.out.println("Escolha uma das opçoes abaixo");
		System.out.println("1-Adicionar Produtos ao Estoque");
		System.out.println("2-Remover Produtos ao Estoque");
		System.out.println("3-Atualizar Produtos ao Estoque");
		System.out.println("4-Mostar os Produtos ao Estoque");
		System.out.println("0-Sair do Programa");
		
		System.out.print("Digite a sua opção: ");
		op=leia.nextInt();
		
		switch(op)
		{
		case 1:
			leia.nextLine();
			System.out.println("\nQual o Produto desaja adicionar no estoque");
			String produto =leia.nextLine();
			produtos.add(produto);
			break;
			
		case 2:
			leia.nextLine();
			System.out.println("\nQual o Produto desaja remover do estoque");
			String remov =leia.nextLine();
			System.out.println("Confirme a remoção do produto"
					+ "\n'S' Para SIM"
					+ "\n'N' para NÃO");
			char pess = leia.nextLine().charAt(0);
				if(pess=='S') {
					if(produtos.contains(remov)) {
						
						produtos.remove(remov);
						System.out.println("Produto Removido");
					}
					else {
						System.out.println("Não existe esse produto no estoque!!!!!");
					}
	
				}				
				else if(pess=='N') {
					System.out.println("O Produto Não sera removido!!!!");
				}
				break;
		case 3:
			leia.nextLine();
			System.out.println("Qual o nome do produto que deseja atualizar");
			String check = leia.nextLine();
			System.out.println("Digite o nome atualizado");
			String atual = leia.nextLine();
			if(produtos.contains(check)) {
				produtos.remove(check);
				produtos.add(atual);
			}
			else {
				System.out.println("Não existe esse produto");
			}
			break;
			
		case 4:
			leia.nextLine();
			System.out.println("Esses são os produtos que estão no estoque no exato momento");
			System.out.println("**************************************************************************************");
			System.out.println(produtos);
			break;
		}
		
		}while(op!=0);
		System.out.println("Finalizado com Sucesso!!");
		
	}
}
