programa
{
	
	funcao inicio()
	{
		inteiro numero[5],x,maior=0
		para(x=0;x<5;x++){
		escreva("Escreva um numero: ")
		leia(numero[x])
		
		se(maior<numero[x]){
			maior = numero[x]
		}
		
	}
		
		para(x=0;x<5;x++){
			escreva("\nO numero é digitado: ",numero[x])
		}
		
		escreva("\n\nO numero maior é: ",maior)
		
		}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 236; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */